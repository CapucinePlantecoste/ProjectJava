/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

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
    
    public Connection createConnection()
    {
        try
        {
            String url="jdbc:mysql://localhost:3306/ptest?autoReconnect=true&useSSL=false";
            String user="root";
            String password="Manager26069700";
            conn=DriverManager.getConnection(url, user,password);
        }
        catch(Exception e)
        {
            System.out.println("Error occured"+e.toString());
        }
        return conn;
    }
}