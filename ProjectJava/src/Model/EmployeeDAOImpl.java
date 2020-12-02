/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.EmployeeDAO;
import Model.DataSource;
import Model.Employee;
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
    
    public ArrayList<Employee> registeremployee()
    {
        Connection conn=null;
        ArrayList<Employee> emp=new ArrayList<Employee>();
        try
        {
            DataSource db=new DataSource();
            conn=db.createConnection();
            Statement stmt = conn.createStatement();

            String sqtStat1 = "SELECT * FROM employee";//We get the different values of the different columns of the table employee
            ResultSet result = stmt.executeQuery(sqtStat1);//we execute the query 
            while (result.next()) {

                String a = result.getString("name");//First column of the table 
                String b = result.getString("familyname");
                String c = result.getString("username");
                String d = result.getString("password");
               int e=result.getInt("idemployee");
                
                emp.add(new Employee(e,a, b, c, d));//we create an employee object with the values get ahead
                

            }
            conn.close();
        }
               catch (SQLException e) {//Possible MY SQL exception 
            System.err.println(e);
        }
        return emp;
           
            
        }
    
    
}
