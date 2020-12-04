//this class implements all the function of the buyer DAO class
package Model;


import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyerDAOImpl implements BuyerDAO {
//we implement the superclass buyerDAO 

    @Override
    public ArrayList<Buyer> registerbuyer() {
        //this method is used to get the buyers registered in the database

        Connection conn = null;
        ArrayList<Buyer> buyers = new ArrayList<>();
        //we create an arraylist of buyers to store them later
        try {
            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database 
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            String sqtStat1 = "SELECT * FROM buyer";
            //We get the different values of the different columns of the table buyer through this sql request
            ResultSet result = stmt.executeQuery(sqtStat1);
            //we execute the query 
            while (result.next()) {
                //we get ALL the values of all the columns of the table buyer
                //name, familyname, username, password, id
                String a = result.getString("name");
                String b = result.getString("familyname");
                String c = result.getString("username");
                String d = result.getString("password");
                int e = result.getInt("idbuyer");

                buyers.add(new Buyer(e, a, b, c, d));
                //we create an employee object with the values get ahead

            }
            conn.close();
            //always close the connection

        } catch (SQLException e) {
            //Possible MY SQL exception 
            System.err.println(e);
        }
        return buyers;
        //we return the arraylist of buyers stored from the connection

    }

    @Override
    public void addbuyer(Buyer a) {
        //function that enables to add a buyer into the database from a given buyer
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database 
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialg with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {
                //we put the new customer into our database 

                stmt.executeUpdate("INSERT INTO buyer " + " (idbuyer,name, familyname, username, password) " + "VALUES" + "('" + a.getid() + "','" + a.getname() + "','" + a.getfamilyname() + "','" + a.getusername() + "','" + a.getpassword() + "' )");
                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //we close the connection
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
