//this class is the house class, which is a subclass of property, so we extend all the property attributes and methods
package Model;

/**
 *
 * @author thoma
 */
public class House extends Property {
//House extends the superclass property

    //these two following attributes are not present in the property class    
    private double gardensurface;
    //Double for the garden surface of the house
    private boolean swimmingpool;
    //boolean that corresponds to if there is a swmming pool or not 

    //constructor of the house class
    public House(int i, String d, double p, String l, int nr, int nbr, int nbf, int tv, double s, int ids, boolean soldprop, String t, double gs, boolean sp)//Constructor
    {
        //constructor of the property class
        super(i, d, p, l, nr, nbr, nbf, tv, s, ids, soldprop, t);

        gardensurface = gs;
        swimmingpool = sp;
    }

    @Override
    public double getgardensurface() //getter to obtain the garden surface
    {
        return gardensurface;
    }

    @Override
    public boolean getswimmingpool() //getter to obtain the boolean of the swimming pool
    {
        return swimmingpool;
    }

    //Sometimes in this project we deal with a property (without knowing if it is a property or a house) so we have to put abstract methods for attributes that are specific to apartment or house
    // But sometimes we know that we won't use them
    // For example, a house doesn't have the attribute elevator but we have to override the mehtod getelevator so we just return true but this fonction will never be used so we could have put anything
    @Override
    public boolean getelevator() //this function will never be used for the class House so we return true but never used 
    {
        return true;
    }

    @Override
    public boolean getparking() //this function will never be used for the class House so we return true but never used 
    {
        return true;
    }

    @Override
    public int getfloornumber() //this function will never be used for the class House so we return 1 but never used 
    {
        return 1;
    }

    @Override
    public int getelevatorsql() //this function will never be used for the class House so we return1  but never used 
    {

        return 1;
    }

    @Override
    public int getparkingsql() //this function will never be used for the class House so we return 1 but never used 
    {

        return 1;
    }

    @Override
    public int getswimmingpoolsql() //in my sql, we cannot set the value of a boolean to true or false, we need to set 0 or 1
    {
        int a;
        if (this.getswimmingpool() == true) {
            a = 1;
            //we set the value to 1
        } else //otherwise
        {
            a = 0;
            //we set the value to 0
        }
        return a;
    }

    // This function is never used so we don't do anything in it
    @Override
    public void setfloornumber(int i) {

    }

    // This function is never used so we don't do anything in it

    @Override
    public void setparking(boolean a) {

    }

    // This function is never used so we don't do anything in it
    @Override
    public void setelevator(boolean a) {

    }

    //Function that is used to set the gardensurface of the house from a given value

    @Override
    public void setgardensurface(double s) {
        gardensurface = s;
    }

    //Function that is used to set if there is a swimmingpool from a given boolean
    @Override
    public void setswimmingpool(boolean a) {
        swimmingpool = a;
    }
}
