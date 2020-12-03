//this class is the employee class, which is a subclass of person, so we extend all the person attributes and methods
package Model;

/**
 *
 * @author thoma
 */
public class Employee extends Person {
//Employee is a derived class of Person

    public Employee(int i, String n, String fn, String u, String p) //COnstructor 
    {
        super(i, n, fn, u, p);
        //constructor of the Person class
    }

    /*@Override
     public void display()
     {
        
     }*/
}
