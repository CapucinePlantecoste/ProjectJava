//This class represents the apartments, which are a subclass of the property class, so we extend all the property methods and attributes
package Model;

/**
 *
 * @author thoma class Appartment which extends Property class and has some
 * attributes and methods more
 */
public class Appartment extends Property {
//Apartment extends the superclass property

    //these three following attributes are not present in the property class
    private boolean elevator;
    //attribute corresponding to if there is an elevator or not 
    private int floornumber;
    //The floor number of the apartments
    private boolean parking;
    //Parking available or not

    //constuctor of the apartment class
    /**
     * constructor of the class Appartment with all the following parameters.
     *
     * @param i for the id of the apartment
     * @param d for the description of the apartment
     * @param p for the price of the apartment
     * @param l for the location of the apartment
     * @param nr for the number of rooms of the apartment
     * @param nbr for the number of bedrooms of the apartment
     * @param nbf for the number of floor(s) of the apartment
     * @param tv for the times that the apartment has been visited
     * @param s for the surface of the apartment
     * @param ids for the id of the seller of the apartment
     * @param soldprop to know if the apartment has been sold or not
     * @param t that specifies the type of the property here 'Apartment'
     * @param e for the elevator access of the apartment
     * @param fnb for the floornumber of the apartment
     * @param prkg for the parking accessof the apartment It calls the
     * constructor of the superclass for the main part of the attributes.
     */
    public Appartment(int i, String d, double p, String l, int nr, int nbr, int nbf, int tv, double s, int ids, boolean soldprop, String t, boolean e, int fnb, boolean prkg)//Constructor
    {
        //constructor of property
        super(i, d, p, l, nr, nbr, nbf, tv, s, ids, soldprop, t);

        elevator = e;
        floornumber = fnb;
        parking = prkg;
    }

    /**
     * getter to have the floornumber of the apartment
     *
     * @return the floornumebr of the apartment
     *
     */
    @Override
    public int getfloornumber() //getter to obtain the floor number
    {
        return floornumber;
    }

    /**
     * getter to see if the apartment has an parking access
     *
     * @return true if it has and false if it has not
     */
    @Override
    public boolean getparking() //getter to obtain if there is a parking or not
    {
        return parking;
    }

    /**
     * gettter to see if the apartment has an elevator access
     *
     * @return true if it has and false if it has not
     */
    @Override
    public boolean getelevator() //getter to obtain if there is an elevator or not
    {
        return elevator;
    }

    /**
     * getter that converts boolean into int for the get elevator method in
     * order to put this value in SQL script
     *
     * @return 1 if the getelevator() method returns true and 0 it it returns
     * false
     */
    @Override
    public int getelevatorsql() //in MySQL, we cannot assign a boolean to true or false, so we give it the 0 or 1 value
    {
        int a;
        if (this.getelevator() == true) //if there is an elevator, the boolean is true, 
        {
            a = 1;
            //so we set the value to 1
        } else //oterwise, it is equal to 0
        {
            a = 0;
        }
        return a;
    }

    /**
     * getter that converts boolean into int for the getparking method in order
     * to put this value in SQL script
     *
     * @return 1 if the getparking() method returns true and 0 it it returns
     * false
     */

    @Override
    public int getparkingsql() //in MySQL, we cannot asign a boolean to true or false, so we give it the 0 or 1 value
    {
        int a;
        if (this.getparking() == true) //if there is a parking, the boolean is true,
        {
            a = 1;
            //so we set the value to 1
        } else //otherwise, it is equal to 0
        {
            a = 0;
        }
        return a;
    }

    /**
     * method that must be implemented as it is in abstract in the property
     * class but it is not used in this class(only in the class House)
     *
     * @return 1 as a random value
     */
    //Sometimes in this project we deal with a property (without knowing if it is a property or a house) so we have to put abstract methods for attributes that are specific to apartment or house
    // But sometimes we know that we will not use them
    // For example, an apartment does not have the attribute gardensurface but we have to override the method getgardensurface so we just put a random value in this get but this fonction will never be used
    @Override
    public double getgardensurface() //we have to override this method but we won't use it for an apartment so we return 1 but it will never be used
    {
        return 1;
    }

    /**
     * method that must be implemented as it is in abstract in the property
     * class but it is not used in this class(only in the class House)
     *
     * @return true as a random value
     */
    @Override
    public boolean getswimmingpool() //we have to override this method so we set a fixed value but we won't use it as well
    {
        return true;
    }

    /**
     * method that must be implemented as it is in abstract in the property
     * class but it is not used in this class(only in the class House)
     *
     * @return 1 as a random value
     */
    @Override
    public int getswimmingpoolsql() //FUnction that is used in House but not in this class
    {
        return 1;
    }

    /**
     * method that must be implemented as it is in abstract in the property
     * class but it is not used in this class(only in the class House)
     *
     * @param s
     */
    @Override
    //FUnction that is used in House but not in this class
    public void setgardensurface(double s) {

    }

    /**
     * method that must be implemented as it is in abstract in the property
     * class but it is not used in this class(only in the class House)
     *
     * @param a
     */
    //FUnction that is used in House but not in this class
    @Override
    public void setswimmingpool(boolean a) {

    }

    /**
     * Setter for the floornumber attribute
     *
     * @param fn which is the new floornumber
     */
    //This function is to set a floornumber from a given value
    @Override
    public void setfloornumber(int fn) {
        floornumber = fn;
    }

    /**
     * Setter for the parking attribute
     *
     * @param a which is true if there is a parking access and no if there is
     * not
     */
    //This function is to set the boolean parking from a given boolean
    @Override
    public void setparking(boolean a) {
        parking = a;
    }

    /**
     * Setter for the elevator attribute
     *
     * @param a which is true if there is an elevator access and no if there is
     * not
     */
    //This function is to set the boolean elevator from a given boolean
    @Override
    public void setelevator(boolean a) {
        elevator = a;
    }

}
