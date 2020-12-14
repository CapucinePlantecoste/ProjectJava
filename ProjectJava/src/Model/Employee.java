//this class is the employee class, which is a subclass of person, so we extend all the person attributes and methods
package Model;

/**
 * Class Employee that extends Person and has no attributed added.
 *
 * @author thoma
 */
public class Employee extends Person {
//Employee is a derived class of Person

    /**
     * Constructor of the Employee class
     *
     * @param i which is the id of the employee
     * @param n which is the name of the employee
     * @param fn which is the familyname of the employee
     * @param u which is the username of the employee
     * @param p which is the password of the employee It uses the constructor of
     * the superclass Person
     */
    public Employee(int i, String n, String fn, String u, String p) //COnstructor 
    {
        super(i, n, fn, u, p);
        //constructor of the Person class
    }

}
