//this class implements all the function of the SellerDAO class
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
public class SellerDAOImpl implements SellerDAO {
//the class sellerDAO is an interface so we have to implement all its functions here 

    @Override
    public ArrayList<Seller> registerseller() //this method enables to get all the sellers contained in the database
    {
        Connection conn = null;
        ArrayList<Seller> sellers = new ArrayList<>();
        //we create an arraylist of sellers to store them later
        try {
            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database 
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            String sqtStat1 = "SELECT * FROM seller";
            //We get the different values of the different columns of the table seller, through this SQL request
            ResultSet result = stmt.executeQuery(sqtStat1);
            //we execute the query 
            while (result.next()) {
                //we get ALL the values

                String a = result.getString("name");
                //First column of the table 
                String b = result.getString("familyname");
                String c = result.getString("username");
                String d = result.getString("password");
                int e = result.getInt("idseller");

                sellers.add(new Seller(e, a, b, c, d));
                //we create a seller object with the values get ahead
            }
            conn.close();
            //always close the connection
        } catch (SQLException e) {
            //Possible MY SQL exception 
            System.out.println("Erreur" + e.getMessage());
        }
        return sellers;
        //we return the arraylist of sellers stored from the connection  

    }

    @Override
    public void addseller(Seller a) //method used to add a seller to the database 
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

                stmt.executeUpdate("INSERT INTO seller " + " (idseller,name, familyname, username, password) " + "VALUES" + "('" + a.getid() + "','" + a.getname() + "','" + a.getfamilyname() + "','" + a.getusername() + "','" + a.getpassword() + "' )");
                //we insert the sellers attributes inside the databse through this sql query
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
