/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import Model.Property;
import Model.House;
import Model.Appartment;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class PropertyDAOImpl implements PropertyDAO {

    public ArrayList<Property> registerproperty() {
        Connection conn = null;
        ArrayList<Property> pr = new ArrayList<Property>();
        try {
            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            String sqtStat4 = "SELECT * From property";//We get the different values of the different columns of the table house
            ResultSet result4 = stmt.executeQuery(sqtStat4);//we execute the query
            while (result4.next()) {
                if (result4.getString("type").equals("House")) {
                    int a = result4.getInt("id");//First column of the table 
                    String d = result4.getString("description");
                    double p = result4.getDouble("price");
                    String l = result4.getString("location");
                    int nr = result4.getInt("numberrooms");
                    int nbr = result4.getInt("numberbedrooms");
                    int nf = result4.getInt("numberfloors");
                    int tv = result4.getInt(("timevisited"));
                    double s = result4.getDouble("surface");
                    double gs = result4.getDouble("gardensurface");
                    boolean sp = result4.getBoolean("swimmingpool");
                    int ids = result4.getInt("idseller");
                    boolean sold=result4.getBoolean("sold");
                    pr.add(new House(a, d, p, l, nr, nbr, nf, tv, s, ids,sold, "House", gs, sp));
                } else {
                    int a = result4.getInt("id");//First column of the table 
                    String d = result4.getString("description");
                    double p = result4.getDouble("price");
                    String l = result4.getString("location");
                    int nr = result4.getInt("numberrooms");
                    int nbr = result4.getInt("numberbedrooms");
                    int nf = result4.getInt("numberfloors");
                    int tv = result4.getInt(("timevisited"));
                    double s = result4.getDouble("surface");
                    boolean elv = result4.getBoolean("elevator");
                    int fn = result4.getInt("floornumber");
                    boolean prkg = result4.getBoolean("parking");
                    int ids = result4.getInt("idseller");
                    boolean sold=result4.getBoolean("sold");
                    pr.add(new Appartment(a, d, p, l, nr, nbr, nf, tv, s, ids,sold, "Apartment", elv, fn, prkg));

                }

            }
        } catch (SQLException e) {//Possible MY SQL exception 
            System.err.println(e);
        }
        return pr;
    }

    @Override
    public void addproperty(Property a, int b) {
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                if(b==1)
                {
                    

                    stmt.executeUpdate("INSERT INTO property " + " (id, type,description, price, location, numberrooms, numberbedrooms, timevisited, numberfloors, surface, gardensurface, swimmingpool, elevator, floornumber, parking, idseller) " + "VALUES" + "('" + a.getid() + "','Apartment','" + a.getdescription() + "','" + a.getprice() + "','" + a.getlocation() + "','" + a.getnumberrooms() + "','" + a.getnumberbedrooms() + "','0','" + a.getnumberfloors() + "','" + a.getsurface() + "',null,null,'" + a.getelevatorsql() + "','" + a.getfloornumber() + "','" + a.getparkingsql() + "','" + a.getidseller() + "' )");
                    System.out.println("coucou");
                }
                else
                {
                     stmt.executeUpdate("INSERT INTO property " + " (id, type,description, price, location, numberrooms, numberbedrooms, timevisited, numberfloors, surface, gardensurface, swimmingpool, elevator, floornumber, parking, idseller) " + "VALUES" + "('" + a.getid() + "','House','" + a.getdescription() + "','" + a.getprice() + "','" + a.getlocation() + "','" + a.getnumberrooms() + "','" + a.getnumberbedrooms() + "','0','" + a.getnumberfloors() + "','" + a.getsurface() + "','" + a.getgardensurface() + "','"+a.getswimmingpoolsql()+"',null,null,null,'" + a.getidseller() + "' )");
                }
                conn.commit();
                conn.close();

            } catch (SQLException f) {//possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {//Possible MySql connection exception
            System.err.println(e);
        }
    }
    
    @Override
    public void updatetv(Property a)
    {
         Connection conn = null;
        try {

            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                
                    stmt.executeUpdate("UPDATE property SET timevisited='"+a.gettimevisited()+"' where id='"+a.getid()+"';");
                
                conn.commit();
                conn.close();

            } catch (SQLException f) {//possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {//Possible MySql connection exception
            System.err.println(e);
        }
    }
    
    @Override 
    public void offeraccepted(Property a)
    {
         Connection conn = null;
        try {

            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                
                    stmt.executeUpdate("UPDATE property SET sold=true where id='"+a.getid()+"';");
                
                conn.commit();
                conn.close();

            } catch (SQLException f) {//possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {//Possible MySql connection exception
            System.err.println(e);
        }
        
    }
            
}
