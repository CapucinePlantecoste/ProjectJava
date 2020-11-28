/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;
import Controller.Offer;
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
                

                offers.add(new Offer(a, b, c, d));//we create an employee object with the values get ahead

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
    
}
