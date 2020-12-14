//this class establishes the connection with our database, thanks to the user, password and username
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Class which establishes the link between the data source and the program
 * Netbeans. It is used each time that we want to connect to the database
 *
 * @author thoma
 */
public class DataSource {

    Connection conn = null;

    /**
     * Method to create the connection between the program and the database.
     *
     * @return conn which is the connection (if the connection has been
     * succesful)
     */
    public Connection createConnection() //we create the connection, this method is reused everytime we link with the database, so in every DAO methods
    {
        try {
            String url = "jdbc:mysql://localhost:3306/ptest?autoReconnect=true&useSSL=false";
            //URL corresponding with the name of our database, here, ptest, on port 3306
            String user = "root";
            //username
            String password = "Manager26069700";
            //password to connect to MYSql 
            conn = DriverManager.getConnection(url, user, password);
            //we establish the connection
        } catch (Exception e) //possible MYSql exception
        {
            System.out.println("Error occured" + e.toString());
        }
        return conn;
    }
}
