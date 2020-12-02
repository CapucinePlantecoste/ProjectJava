//this class is the buyer class, which is a subclass of customer, so we extend all the customers attributes and methods
package Model;


/**
 *
 * @author thoma
 */
public class Buyer extends Customer{
    
    //there is no other attribute in buyer than in customer
    
    public Buyer(int i,String n, String fn, String u, String p)//constructor of the class
    {
        super(i,n,fn,u,p);//constructor of customer (superclass) class
    }
    
    /*@Override
    public void display()
    {
        //affichage à voir apres
    }*/
    
   
}
