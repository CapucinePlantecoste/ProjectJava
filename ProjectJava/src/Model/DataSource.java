//this class establishes the connection with our database, thanks to the user, password and username
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author thoma
 */
public class DataSource {
    
    Connection conn=null;
    
    public Connection createConnection()//we create the connection, this method is reused everytime we link with the database
    {
        try
        {
            String url="jdbc:mysql://localhost:3306/ptest?autoReconnect=true&useSSL=false";//URL corresponding with the name of our database, here, ptest, on port 3306
            String user="root";//username
            String password="Manager26069700";//password to connect to MYSql 
            conn=DriverManager.getConnection(url, user,password);//we establish the connection
        }
        catch(Exception e)//possible MYSql exception
        {
            System.out.println("Error occured"+e.toString());
        }
        return conn;
    }
}