//This class is the visit class, which represents all the visits the buyers make and the sellers introduce
package Model;

import java.sql.Timestamp;

/**
 * Class Visit that contains all the information about a Visit of a Buyer to a
 * Property
 *
 * @author thoma
 */
public class Visit {

    //all the attributes of the visit class
    //id, id of the buyer, id of the property, id of the employee who makes the viewing, date of the viewing ts, duration of the viewin
    private int id;
    private int idbuyer;
    private int idprop;
    private int idemp;
    Timestamp ts;
    private int duration;

    /**
     * Constructor of the class
     *
     * @param i is the id of the Visit
     * @param idb is the id of the buyer who does the viewing
     * @param idp is the id of the property in which the visit is done
     * @param ide is the id of the employee that does the visit
     * @param t is the date of the visit
     * @param d is the duration of the visit
     */
    public Visit(int i, int idb, int idp, int ide, Timestamp t, int d) //constructor of the visit class
    {
        id = i;
        idbuyer = idb;
        idprop = idp;
        idemp = ide;
        ts = t;
        duration = d;
    }

    /**
     * Method to get the id of the buyer who does the visit
     *
     * @return the id of the buyer who does the visit
     */
    public int getidbuyer() //method that enables to get the id of the buyer that booked the viewing
    {
        return idbuyer;
    }

    /**
     * Method to get the id of the property that is visited
     *
     * @return the id of the property
     */
    public int getidprop() //method that enables to get the id of the property where the wiewing will be done
    {
        return idprop;
    }

    /**
     * Method to get the id of the employee who does the visit
     *
     * @return this id
     */
    public int getidemp() //method that enables to get the id of the emplee that will ensure the viewing
    {
        return idemp;
    }

    /**
     * Method to display the date of the viewing
     *
     * @return the date converted to String
     */
    public String displaydate() //method that enables to display the date of the viewing     
    {
        return ts.toString();
    }

    /**
     * Method to display the date of the viewing
     *
     * @return the date
     */
    public Timestamp gettime() //method that enables to get the date of the viewing
    {
        return ts;
    }

    /**
     * Method to get the duration of the visit
     *
     * @return this duration
     */
    public int getduration() //method that enables to get the duration of the viewing
    {
        return duration;
    }

    /**
     * Method to get the id of the visit
     *
     * @return the id of the visit
     */
    public int getid() //method that enables us to get the id of the viewing
    {
        return id;
    }

    /**
     * Method to set the id of the buyer who does the visit
     *
     * @param idb is the id of the buyer who does the viewing
     */
    public void setidbuyer(int idb) //method that enables us to set the id of the buyer that is going to do the viewing 
    {
        idbuyer = idb;
    }

}
