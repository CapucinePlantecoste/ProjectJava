//This class is the visit class, which represents all the visits the buyers make and the sellers introduce
package Model;
import java.sql.Timestamp;

/**
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
    
    public Visit(int i, int idb, int idp, int ide, Timestamp t, int d )
    //constructor of the visit class
    {
        id=i;
        idbuyer=idb;
        idprop=idp;
        idemp=ide;
        ts=t;
        duration=d;
    }
    
    public int getidbuyer()
    //method that enables to get the id of the buyer that booked the viewing
    {
        return idbuyer;
    }
    
    public int getidprop()
    //method that enables to get the id of the property where the wiewing will be done
    {
        return idprop;
    }
    
    public int getidemp()
    //method that enables to get the id of the emplee that will ensure the viewing
    {
        return idemp;
    }
    
    public String displaydate()
    //method that enables to display the date of the viewing     
    {
        return ts.toString();
    }
    public Timestamp gettime()
    //method that enables to get the date of the viewing
    {
        return ts ; 
    }
    
    public int getduration()
    //method that enables to get the duration of the viewing
    {
        return duration;
    }
    
    public int getid()
    //method that enables us to get the id of the viewing
    {
        return id;
    }
    
    public void setidbuyer(int idb)
    //method that enables us to set the id of the buyer that is going to do the viewing 
    {
        idbuyer=idb;
    }
    
    
}
