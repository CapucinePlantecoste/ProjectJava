//this class is the house class, which is a subclass of property, so we extend all the property attributes and methods
package Model;

/**
 * Class House which extends the Property class
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
    /**
     * constructor of the class Appartment with all the following parameters.
     *
     * @param i for the id of the house
     * @param d for the description of the house
     * @param p for the price of the house
     * @param l for the location of the house
     * @param nr for the number of rooms of the house
     * @param nbr for the number of bedrooms of the house
     * @param nbf for the number of floor(s) of the house
     * @param tv for the times that the house has been visited
     * @param s for the surface of the house
     * @param ids for the id of the seller of the house
     * @param soldprop to know if the house has been sold or not
     * @param t that specifies the type of the property here 'House'
     * @param gs for the gardensurface of the house
     * @param sp for the possible swimmingpool of the house It calls the
     * constructor of the superclass for the main part of the attributes.
     */
    public House(int i, String d, double p, String l, int nr, int nbr, int nbf, int tv, double s, int ids, boolean soldprop, String t, double gs, boolean sp)//Constructor
    {
        //constructor of the property class
        super(i, d, p, l, nr, nbr, nbf, tv, s, ids, soldprop, t);

        gardensurface = gs;
        swimmingpool = sp;
    }

    /**
     * Method to get the garden surface of the House
     *
     * @return gardensurface which is the garden surface of the House
     */
    @Override
    public double getgardensurface() //getter to obtain the garden surface
    {
        return gardensurface;
    }

    /**
     * Method to get if the house has a swimming pool or not
     *
     * @return true if it has and false if it has not
     */

    @Override
    public boolean getswimmingpool() //getter to obtain the boolean of the swimming pool
    {
        return swimmingpool;
    }

    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @return true as a random value( it could have been false)
     */
    //Sometimes in this project we deal with a property (without knowing if it is a property or a house) so we have to put abstract methods for attributes that are specific to apartment or house
    // But sometimes we know that we won't use them
    // For example, a house doesn't have the attribute elevator but we have to override the mehtod getelevator so we just return true but this fonction will never be used so we could have put anything
    @Override
    public boolean getelevator() //this function will never be used for the class House so we return true but never used 
    {
        return true;
    }

    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @return true as a random value( it could have been false)
     */
    @Override
    public boolean getparking() //this function will never be used for the class House so we return true but never used 
    {
        return true;
    }

    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @return 1(it could have been anything)
     */
    @Override
    public int getfloornumber() //this function will never be used for the class House so we return 1 but never used 
    {
        return 1;
    }

    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @return 1(it could have been anything)
     */
    @Override
    public int getelevatorsql() //this function will never be used for the class House so we return1  but never used 
    {

        return 1;
    }

    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @return 1(it could have been anything)
     */
    @Override
    public int getparkingsql() //this function will never be used for the class House so we return 1 but never used 
    {

        return 1;
    }

    /**
     * Method to convert the boolean swimming pool into an int in order to put
     * it later in the database
     *
     * @return 1 if getswimmingpool() returns true, else 0
     */
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

    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @param i which is a random i
     */
    // This function is never used so we don't do anything in it
    @Override
    public void setfloornumber(int i) {

    }

    // This function is never used so we don't do anything in it
    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @param a which is true or false (random)
     */
    @Override
    public void setparking(boolean a) {

    }

    /**
     * Method that needed to be implemented because it is an abstract method in
     * Property but never used for the House class
     *
     * @param a which is true or false (random)
     */
    // This function is never used so we don't do anything in it
    @Override
    public void setelevator(boolean a) {

    }

    //Function that is used to set the gardensurface of the house from a given value
    /**
     * Method to set the value of the garden surface attribute
     *
     * @param s which is the new garden surface of the house
     */
    @Override
    public void setgardensurface(double s) {
        gardensurface = s;
    }

    /**
     * Method to set if there is a swimming pool or not
     *
     * @param a which is true or false
     */
    //Function that is used to set if there is a swimmingpool from a given boolean
    @Override
    public void setswimmingpool(boolean a) {
        swimmingpool = a;
    }
}
