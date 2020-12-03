//this class consolidates access to persistent data concerning the employees  
package Model;

import Model.Employee;
import java.util.ArrayList;

/**
 *
 * @author CAP
 */
public interface EmployeeDAO {
//this class is an iterface, all the methods will be implemented in the EmployeeDAOImpl class

    ArrayList<Employee> registeremployee();
    //We create an arraylist of employees get from the database

}
