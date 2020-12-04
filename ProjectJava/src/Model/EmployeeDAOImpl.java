//this class implements all the function of the employeeDAO class
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
public class EmployeeDAOImpl implements EmployeeDAO {
//we implement the superclass employeeDAO

    @Override
    public ArrayList<Employee> registeremployee() //this method is used to get the employees registered from the database
    {
        Connection conn = null;
        ArrayList<Employee> emp = new ArrayList<>();
        //we create an arraylist of employees to store them later
        try {
            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database 
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            String sqtStat1 = "SELECT * FROM employee";
            //We get the different values of the different columns of the table employee through this sql request
            ResultSet result = stmt.executeQuery(sqtStat1);
            //we execute the query 
            while (result.next()) {
                //we get ALL the values of the table

                String a = result.getString("name");
                //First column of the table 
                String b = result.getString("familyname");
                String c = result.getString("username");
                String d = result.getString("password");
                int e = result.getInt("idemployee");

                emp.add(new Employee(e, a, b, c, d));
                //we create an employee object with the values get ahead

            }
            conn.close();
            //always close the connection
        } catch (SQLException e) {
        //Possible MY SQL exception 
            System.err.println(e);
        }
        return emp;
        //we return the arraylist of employees stored from the connection
    }

}
