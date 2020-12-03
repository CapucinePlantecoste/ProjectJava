//this class implements all the function of the PropertyDAO class
package Model;

import Model.PropertyDAO;
import Model.DataSource;
import Model.Property;
import Model.House;
import Model.Appartment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class PropertyDAOImpl implements PropertyDAO {
//PropertyDAO was an interface so we have to develop all its methods here
    
    public ArrayList<Property> registerproperty() {
    //method used to get the properties registered in the database
        Connection conn = null;
        ArrayList<Property> pr = new ArrayList<Property>();
        //we create an arraylist of properties to store them later
        try {
            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            String sqtStat4 = "SELECT * From property";
            //We get the different values of the different columns of the table property through this sql request
            ResultSet result4 = stmt.executeQuery(sqtStat4);
            //we execute the query
            while (result4.next()) {
                //we get ALL the values of the table
                if (result4.getString("type").equals("House")) {
                    //if we have a house
                    int a = result4.getInt("id");
                    //First column of the table 
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
                    boolean sold = result4.getBoolean("sold");
                    pr.add(new House(a, d, p, l, nr, nbr, nf, tv, s, ids, sold, "House", gs, sp)); 
                    //we create a house object with the values get ahead and we add it in the property arraylist
                } else {
                    //if the property is an apartment, we get all the values of all the columns 
                    int a = result4.getInt("id");
                    //First column of the table 
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
                    boolean sold = result4.getBoolean("sold");
                    pr.add(new Appartment(a, d, p, l, nr, nbr, nf, tv, s, ids, sold, "Apartment", elv, fn, prkg));
                    //we create an apartment object with the values get ahead and we add it in the property arraylist

                }

            }
        } catch (SQLException e) {
        //Possible MY SQL exception 
            System.err.println(e);
        }
        return pr;
        //we return the arraylist of all the properties we get in the database 
    }

    @Override
    public void addproperty(Property a, int b) {
    //this method is used to add a property to the database 
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {
            //we put the new property into our database 

                if (b == 1) {
                //if the property is an apartment, we add into the table property the corresponding values

                    stmt.executeUpdate("INSERT INTO property " + " (id, type,description, price, location, numberrooms, numberbedrooms, timevisited, numberfloors, surface, gardensurface, swimmingpool, elevator, floornumber, parking, idseller,sold) " + "VALUES" + "('" + a.getid() + "','Apartment','" + a.getdescription() + "','" + a.getprice() + "','" + a.getlocation() + "','" + a.getnumberrooms() + "','" + a.getnumberbedrooms() + "','0','" + a.getnumberfloors() + "','" + a.getsurface() + "',null,null,'" + a.getelevatorsql() + "','" + a.getfloornumber() + "','" + a.getparkingsql() + "','" + a.getidseller() + "',0 )");
                } else {
                    //otherwise, if is a house, we add into the table property the corresponding values
                    stmt.executeUpdate("INSERT INTO property " + " (id, type,description, price, location, numberrooms, numberbedrooms, timevisited, numberfloors, surface, gardensurface, swimmingpool, elevator, floornumber, parking, idseller,sold) " + "VALUES" + "('" + a.getid() + "','House','" + a.getdescription() + "','" + a.getprice() + "','" + a.getlocation() + "','" + a.getnumberrooms() + "','" + a.getnumberbedrooms() + "','0','" + a.getnumberfloors() + "','" + a.getsurface() + "','" + a.getgardensurface() + "','" + a.getswimmingpoolsql() + "',null,null,null,'" + a.getidseller() + "',0 )");
                }
                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //always close the connection

            } catch (SQLException f) {
            //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
        //Possible MySql connection exception
            System.err.println(e);
        }
    }

    @Override
    public void updatetv(Property a) {
    //method that enables to update the number of visits of a property into the database
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {

                stmt.executeUpdate("UPDATE property SET timevisited='" + a.gettimevisited() + "' where id='" + a.getid() + "';");
                //we update the number of visits of the database through this sql query
                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //always close the connection

            } catch (SQLException f) {
            //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
        //Possible MySql connection exception
            System.err.println(e);
        }
    }

    @Override
    public void offeraccepted(Property a) {
    //method that enables us to set the boolean sold to true in the database if the offer of the corresponding property has been accepted 
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {

                stmt.executeUpdate("UPDATE property SET sold=true where id='" + a.getid() + "';");
                //we update the boolean corresponding to if the property is sold or not in the database through this sql query

                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //always close the connection

            } catch (SQLException f) {
            //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
        //Possible MySql connection exception
            System.err.println(e);
        }

    }

    @Override
    public void deleteproperty(Property a) {
    //method that enables us to delete a property in the database
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {
                
                stmt.executeUpdate("delete from visit where idproperty='"+a.getid()+"';");
                //we delete from the visit table of the database the visits relied to the property that has just been sold 
                stmt.executeUpdate("delete from offer where idproperty='"+a.getid()+"';");
                //we delete from the offer table of the database the offers relied to the property that has just been sold 

                stmt.executeUpdate("delete from property where id='" + a.getid() + "';");
                //finally, we delete the property that has just been sold from the database through this sql query 

                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //always close the connection

            } catch (SQLException f) {
            //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
        //Possible MySql connection exception
            System.err.println(e);
        }
    }
    
    @Override
    public void update(Property a, int b)
    //method that enables us to update a property in the database by modyfing one or several attributes 
    {
          Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
           
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try { 

                if(b==1)
                //if the property considered is an apartment, we update the corresponding values to the new ones
                {
                    PreparedStatement stmt = conn.prepareStatement("update property set description=?,price=?, location=?, numberrooms=?, numberbedrooms=?, numberfloors=?, surface=?, elevator=?,floornumber=?, parking=? where id=?");
               
                    stmt.setString(1,a.getdescription());
                    stmt.setDouble(2,a.getprice());
                    stmt.setString(3,a.getlocation());
                    stmt.setInt(4, a.getnumberrooms());
                    stmt.setInt(5,a.getnumberbedrooms());
                    stmt.setInt(6, a.getnumberfloors());
                    stmt.setDouble(7,a.getsurface());
                    stmt.setInt(8,a.getelevatorsql());
                    stmt.setInt(9,a.getfloornumber());
                    stmt.setInt(10,a.getparkingsql());
                    stmt.setInt(11,a.getid());
                    stmt.executeUpdate();
                    conn.commit();
                    
                    
             //TU COMMENTERAS SI TU AS COMPRIS
                }
                else
                //otherwise, the property considered is a house, we update the corresponding values to the new ones
                {
                    PreparedStatement stmt=conn.prepareStatement("update property set description=?,price=?, location=?, numberrooms=?, numberbedrooms=?, numberfloors=?, surface=?, gardensurface=?, swimmingpool=? where id=?");
                    //sql query that sets the corresponding fields with updated values 
                    stmt.setString(1,a.getdescription());
                    stmt.setDouble(2,a.getprice());
                    stmt.setString(3,a.getlocation());
                    stmt.setInt(4, a.getnumberrooms());
                    stmt.setInt(5,a.getnumberbedrooms());
                    stmt.setInt(6, a.getnumberfloors());
                    stmt.setDouble(7,a.getsurface());
                    stmt.setDouble(8,a.getgardensurface());
                    stmt.setInt(9,a.getswimmingpoolsql());
                    stmt.setInt(10,a.getid());
                    stmt.executeUpdate();
                     conn.commit();
                }

              
                //COMMIT statement to the MySQL server
                conn.close();
                //Always close the connection

            } catch (SQLException f) {
            //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
        //Possible MySql connection exception
            System.err.println(e);
        }

    }
}
