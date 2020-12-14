//this class consolidates access to persistent data concerning the employees  
package Model;

import java.util.ArrayList;

/**
 * Interface EmployeeDAO which contains all the functions needed if we want to
 * do an action concerning a employee and the connection to the database.
 *
 * @author CAP
 *
 */
public interface EmployeeDAO {
//this class is an iterface, all the methods will be implemented in the EmployeeDAOImpl class

    /**
     * Method to get all the employees from the database(once it is implemented)
     *
     * @return ArrayList which is an ArrayList of all the employee from the
     * table Employee
     */
    ArrayList<Employee> registeremployee();
    //We create an arraylist of employees that we  get from the database

}
