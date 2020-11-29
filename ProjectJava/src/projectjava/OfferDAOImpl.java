/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;
import Model.Offer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class OfferDAOImpl implements OfferDAO {
    
    @Override
    public ArrayList<Offer> registeroffer()
    {
        Connection conn = null;
        ArrayList<Offer> offers = new ArrayList<Offer>();
        try {
            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            String sqtStat1 = "SELECT * FROM offer";//We get the different values of the different columns of the table employee
            ResultSet result = stmt.executeQuery(sqtStat1);//we execute the query 
            while (result.next()) {

                int a = result.getInt("idoffer");//First column of the table 
                int b  = result.getInt("idbuyer");
                int c= result.getInt("idproperty");
                double d = result.getDouble("price");
                boolean declined=result.getBoolean("declined");
                boolean accepted=result.getBoolean("accepted");
                

                offers.add(new Offer(a, b, c, d, accepted, declined));//we create an employee object with the values get ahead

            }
            conn.close();

        } catch (SQLException e) {//Possible MY SQL exception 
            System.err.println(e);
        }
        return offers;
    }
    
    @Override
    public void addoffer(Offer a)
    {
        
    }
    
    @Override
    public void acceptoffer(Offer a, ArrayList<Offer> o)
    {
         Connection conn = null;
        try {

            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                
                
               
                stmt.executeUpdate("UPDATE offer SET accepted=true where idoffer='"+a.getid()+"';");
                for(int i=0;i<o.size();++i)
                {
                    if(o.get(i).getidprop()==a.getidprop() && o.get(i).getid()!=a.getid())
                    {
                         stmt.executeUpdate("UPDATE offer SET declined=true where idoffer='"+o.get(i).getid()+"';");
                    }
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
    public void declineoffer(Offer a)
    {
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                
                
               
                stmt.executeUpdate("UPDATE offer SET declined=true where idoffer='"+a.getid()+"';");
                
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
