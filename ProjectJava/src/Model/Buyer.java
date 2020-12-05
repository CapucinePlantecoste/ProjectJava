//this class is the buyer class, which is a subclass of Person, so we extend all the customers attributes and methods
package Model;

/**
 *
 * @author thoma
 */
public class Buyer extends Person {

    //there is no other attribute in Buyer than in Person
    public Buyer(int i, String n, String fn, String u, String p) //constructor of the class
    {
        super(i, n, fn, u, p);
        //constructor of Person (superclass) class
    }

}
