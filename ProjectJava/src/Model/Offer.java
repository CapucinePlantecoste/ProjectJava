//This class is the offer class, which represent all the offers the buyers make when they want to buy a property
package Model;

/**
 *
 * @author thoma
 */
public class Offer {

    //The attributes of the offer : id (primary key), idbuyer, idproperty....
    private int id;
    private int idbuyer;
    private int idproperty;
    private double price;
    private boolean accepted;
    private boolean declined;

    public Offer(int i, int idb, int idp, double p, boolean a, boolean d) //constructor of the class
    {
        id = i;
        idbuyer = idb;
        idproperty = idp;
        price = p;
        accepted = a;
        declined = d;
    }

    public int getidbuyer() //getter to obtain the id of the buyer
    {
        return idbuyer;
    }

    public void setidbuyer(int idb) //setter to fix the id of the buyer to idb
    {
        idbuyer = idb;
    }

    public int getidprop() //getter to obtain the id of the property
    {
        return idproperty;
    }

    public double getprice() //getter to obtain the amount of the offer  
    {
        return price;
    }

    public boolean getaccepted() //Getter to obtain the boolean which is equal to 1 if the offer is accepted and equal to 0 otherwise
    {
        return accepted;
    }

    public void setaccepted(boolean a) //setter to fix the boolean which defines if the offers has been accepted or not
    {
        accepted = a;
    }

    public int getid() //getter to obtain the id of the offer 
    {
        return id;
    }

    public boolean getdeclined() //the getter to obtain the boolean that tells if the offer has been declined or not
    {
        return declined;
    }

    public void setdeclined(boolean d) //setter method to fix the boolean which defines if the offer has been declined or not
    {
        declined = d;
    }
}
