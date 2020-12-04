//this class implements all the function of the OfferDAO class
package Model;


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
//OfferDAO was an interface so we have to develop all its methods here 

    @Override
    public ArrayList<Offer> registeroffer() 
    //method used to get the offers registered in the database
    {
        Connection conn = null;
        ArrayList<Offer> offers = new ArrayList<>();
        //we create an arraylist of offers to store them later
        try {
            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database 
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            String sqtStat1 = "SELECT * FROM offer";
            //We get the different values of the different columns of the table offer through this sql request
            ResultSet result = stmt.executeQuery(sqtStat1);
            //we execute the query 
            while (result.next()) {
                //we get ALL the values of the table
                int a = result.getInt("idoffer");
                //First column of the table 
                int b = result.getInt("idbuyer");
                int c = result.getInt("idproperty");
                double d = result.getDouble("price");
                boolean declined = result.getBoolean("declined");
                boolean accepted = result.getBoolean("accepted");

                offers.add(new Offer(a, b, c, d, accepted, declined));//we create an offer object with the values get ahead
            }
            conn.close();
            //always close the connection
        } catch (SQLException e) {
            //Possible MY SQL exception 
            System.err.println(e);
        }
        return offers;
        //we return the arraylist of all the offers we get in the database
    }

    @Override
    public void addoffer(Offer a) //this method is used to add an offer to the database 
    {
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
                //we also put the new offer into our database 
                //When an offer is added at the beginnng it is nor accepted or declined so we put0 for both fiekds

                stmt.executeUpdate("INSERT INTO offer " + " (idoffer,idbuyer, idproperty, price, accepted,declined) " + "VALUES" + "('" + a.getid() + "','" + a.getidbuyer() + "','" + a.getidprop() + "','" + a.getprice() + "',0,0 )");
                //Sql request
                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //we close the connection
            } catch (SQLException f) {//possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {//Possible MySql connection exception
            System.err.println(e);
        }
    }

    @Override
    public void acceptoffer(Offer a, ArrayList<Offer> o) {
        //this method is used to modify the database when an offer is accepted
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
                
                
                // we set the attribute accepted of the offer that has been accepted at true
                stmt.executeUpdate("UPDATE offer SET accepted=true where idoffer='" + a.getid() + "';");
                //sql request
                for (int i = 0; i < o.size(); ++i) {
                    //we go through our offer array to update the offer that has the same idproperty
                    // if an offer has the same idproperty as the one thas has been accepted but a different id we set declined=true
                    //Because we judge that if an offer is accepted for a property all the other one are declined
                    if (o.get(i).getidprop() == a.getidprop() && o.get(i).getid() != a.getid()) {
                        stmt.executeUpdate("UPDATE offer SET declined=true where idoffer='" + o.get(i).getid() + "';");
                        //sql request to update the value
                    }
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
    public void declineoffer(Offer a) {
        //this method is used to modify the database when an offer is declined
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

                //We look for the offer and set declined=true
                stmt.executeUpdate("UPDATE offer SET declined=true where idoffer='" + a.getid() + "';");
                //sql request

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
}
