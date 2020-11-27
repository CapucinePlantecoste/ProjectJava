/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.util.ArrayList;
import java.sql.Statement;

/**
 *
 * @author thoma
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyerDAOImpl implements BuyerDAO {

    @Override
    public ArrayList<Buyer> registerbuyer() {

        Connection conn = null;
        ArrayList<Buyer> buyers = new ArrayList<Buyer>();
        try {
            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            String sqtStat1 = "SELECT * FROM buyer";//We get the different values of the different columns of the table employee
            ResultSet result = stmt.executeQuery(sqtStat1);//we execute the query 
            while (result.next()) {

                String a = result.getString("name");//First column of the table 
                String b = result.getString("familyname");
                String c = result.getString("username");
                String d = result.getString("password");
                int e = result.getInt("idbuyer");

                buyers.add(new Buyer(e, a, b, c, d));//we create an employee object with the values get ahead

            }
            conn.close();

        } catch (SQLException e) {//Possible MY SQL exception 
            System.err.println(e);
        }
        return buyers;

    }

    @Override
    public void addbuyer(Buyer a) {
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                
                
               
                stmt.executeUpdate("INSERT INTO buyer " + " (idbuyer,name, familyname, username, password) " + "VALUES" + "('" + a.getid() + "','" + a.getname() + "','" + a.getfamilyname() + "','" + a.getusername() + "','" + a.getpassword() + "' )");
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
