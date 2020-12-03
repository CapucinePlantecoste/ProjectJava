//this class is the customer class, which is the superclass of buyer and seller and the subclass of person
package Model;

/**
 *
 * @author CAP
 */
public abstract class Customer extends Person {
//Customer class represents both byuers and sellers 

    public Customer(int i, String n, String fn, String u, String p) //constructor 
    {
        super(i, n, fn, u, p);
        //constructor of the Person class 
    }

}
