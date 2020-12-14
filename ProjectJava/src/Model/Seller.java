//this class is the Seller class, that extends from the person class
package Model;

/**
 * Class Seller that extends Person
 *
 * @author thoma
 */
public class Seller extends Person {
//class seller extends from person class, so we have all the same attributes and methods 

    /**
     * Constructor of the class
     *
     * @param i is the id of the seller
     * @param n is the name of the seller
     * @param fn is the family name of the seller
     * @param u is the username of the seller
     * @param p is the password of the seller The constrcutor of the super class
     * Person is called
     */
    public Seller(int i, String n, String fn, String u, String p) //Constructor of the seller class
    {
        super(i, n, fn, u, p);
        //Constructor of the Person class
    }

}
