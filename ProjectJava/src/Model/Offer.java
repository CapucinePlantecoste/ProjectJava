//This class is the offer class, which represent all the offers the buyers make when they want to buy a property
package Model;

/**
 * Class Offer that represents an Offer that a Buyer hass done for a property.
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

    /**
     * Constructor of the class
     *
     * @param i which is the id of the offer
     * @param idb which is the id of the buyer who made the offer
     * @param idp which is the id of the property that received an offer
     * @param p which is the amount of the offer
     * @param a which is a boolean to see if the offer has been accepted or not
     * @param d which is a boolean to see if the offer has been declined or not
     */
    public Offer(int i, int idb, int idp, double p, boolean a, boolean d) //constructor of the class
    {
        id = i;
        idbuyer = idb;
        idproperty = idp;
        price = p;
        accepted = a;
        declined = d;
    }

    /**
     * Method to get the id of the Buyer who made the offfer
     *
     * @return idbuyer the id of the buyer
     */
    public int getidbuyer() //getter to obtain the id of the buyer
    {
        return idbuyer;
    }

    /**
     * Method to set the id of the Buyer to a specific value
     *
     * @param idb which is the id of the buyer
     */
    public void setidbuyer(int idb) //setter to fix the id of the buyer to idb
    {
        idbuyer = idb;
    }

    /**
     * Method to get the id of the property concerned by the offer
     *
     * @return the id of this property
     */
    public int getidprop() //getter to obtain the id of the property
    {
        return idproperty;
    }

    /**
     * Method to get the amount of the offer
     *
     * @return the amount of the offer
     */
    public double getprice() //getter to obtain the amount of the offer  
    {
        return price;
    }

    /**
     * Method to see if the offer has been accepted or not
     *
     * @return true if it has been accepted, else false
     */
    public boolean getaccepted() //Getter to obtain the boolean which is equal to 1 if the offer is accepted and equal to 0 otherwise
    {
        return accepted;
    }

    /**
     * Method to set the accepted parameter to a new value
     *
     * @param a which is a boolean
     */
    public void setaccepted(boolean a) //setter to fix the boolean which defines if the offers has been accepted or not
    {
        accepted = a;
    }

    /**
     * Method to get the id of the offer
     *
     * @return the id of the offer
     */
    public int getid() //getter to obtain the id of the offer 
    {
        return id;
    }

    /**
     * Method to see if the offer has been accepted or not
     *
     * @return true if it has been declined, else false
     */
    public boolean getdeclined() //the getter to obtain the boolean that tells if the offer has been declined or not
    {
        return declined;
    }

    /**
     * Method to set the attribute declined to a new value
     *
     * @param d which is a boolean
     */
    public void setdeclined(boolean d) //setter method to fix the boolean which defines if the offer has been declined or not
    {
        declined = d;
    }
}
