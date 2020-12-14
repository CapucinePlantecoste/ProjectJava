//this class is the buyer class, which is a subclass of Person, so we extend all the customers attributes and methods
package Model;

/**
 *
 * @author thoma Class Buyer that extends Person class No attributes added to
 * this class compared to Person class
 */
public class Buyer extends Person {

    //there is no other attribute in Buyer than in Person
    /**
     * Constructor of the Buyer class.
     *
     * @param i for the id of the buyer
     * @param n for the name of the buyer
     * @param fn for the familyname of the buyer
     * @param u for the username of the buyer
     * @param p for the password of the buyer
     *
     */
    public Buyer(int i, String n, String fn, String u, String p) //constructor of the class
    {
        super(i, n, fn, u, p);
        //constructor of Person (superclass) class
    }

}
