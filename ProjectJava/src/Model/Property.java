//this class is the class property, the superclass of apartment and house
package Model;

/**
 * Abstract class Property
 *
 * @author thoma
 */
public abstract class Property {

    //All the attributes that are common to a house and an apartment
    private int id;
    private double price;
    private String location;
    private int numberrooms;
    private int numberbedrooms;
    private int timevisited;
    private int numberfloors;
    private double surface;
    private int idseller;
    private String description;
    private String type;
    private boolean sold;

    /**
     * Constructor of the class
     *
     * @param i which is the id of the property
     * @param d which is the description of the property
     * @param p which is the price of the property
     * @param l which is the location of the property
     * @param nr which is the number of rooms of the property
     * @param nbr which is the number of bedrooms of the property
     * @param nbf which is the number of bedrooms of the property
     * @param tv which is the times that the property has been visited
     * @param s which is the surface of the property
     * @param ids which is the id of the seller of the property
     * @param soldprop which indicates if the property has been sold or not
     * @param t which is the type of the property ("Apartment" or "House")
     */
    public Property(int i, String d, double p, String l, int nr, int nbr, int nbf, int tv, double s, int ids, boolean soldprop, String t)//Constructor
    {
        //constructor of property, this constructor will also be called in apartment and house classes with super(..)
        id = i;
        description = d;
        price = p;
        location = l;
        numberrooms = nr;
        numberbedrooms = nbr;
        numberfloors = nbf;
        timevisited = tv;
        surface = s;
        idseller = ids;
        type = t;
        sold = soldprop;
    }

    /**
     * Method to get the id of the seller of the property
     *
     * @return the id of the seller
     */
    public int getidseller() //method to get the id of the seller of the property
    {
        return idseller;
    }

    /**
     * Method to get the description of the property
     *
     * @return the descritpion of the house
     */
    public String getdescription() //method to get the description of the property
    {
        return description;
    }

    /**
     * Method to get the price of the property
     *
     * @return the price of the property
     */
    public double getprice() //method to get the price of the property
    {
        return price;
    }

    /**
     * Method to get the number of rooms of the property
     *
     * @return the number of rooms of the property
     */
    public int getnumberrooms() //method to get the number of rooms of the property
    {
        return numberrooms;
    }

    /**
     * Method to get the number of bedrooms of the property
     *
     * @return the number of bedrooms of the property
     */
    public int getnumberbedrooms() //method to get the number of bedrooms of the property
    {
        return numberbedrooms;
    }

    /**
     * Method to get the times that the property has been visited
     *
     * @return this number
     */
    public int gettimevisited() //method to get the number of visits of the property
    {
        return timevisited;
    }

    /**
     * Method to get the number of floors of the property
     *
     * @return this number
     */
    public int getnumberfloors() //method to get the number of floors of the property
    {
        return numberfloors;
    }

    /**
     * Method to get the surface of the property
     *
     * @return the surface of the property
     */
    public double getsurface() //method to get the surface of the property
    {
        return surface;
    }

    /**
     * Method to get the location of the property
     *
     * @return the location of the property
     */
    public String getlocation() //method to get the location of the seller of the property
    {
        return location;
    }

    /**
     * Method to get the type of the property
     *
     * @return the type of the property
     */
    public String gettype() //method to get the type of the property : depending on if it is a house or an apartment
    {
        return type;
    }

    /**
     * Method that set the sold attribute to true or false
     *
     * @param a which is a boolean
     */
    public void setsold(boolean a) //method to set the boolean of the property to 1 if it is sold and to 0 otherwise 
    {
        sold = a;
    }

    /**
     * Method to get if the property has been sold or not
     *
     * @return true if it has no if it has not
     */
    public boolean getsold() //method to get the boolean to know if the property has been sold or not 
    {
        return sold;
    }

    /**
     * Method to get the id of the property
     *
     * @return the id of the property
     */
    public int getid() //method to get the id of the property
    {
        return id;
    }

    /**
     * Method to set the id of the property
     *
     * @param a is the new id of the property
     */
    public void setid(int a) //method that sets the id of the property to id in parameter a
    {
        id = a;
    }

    /**
     * Method to set the number of times that the property has been visited
     *
     * @param a is the number of times that the property has been visited
     */
    public void settimevisited(int a) //method that sets the times visisted of the property to times visites in parameter s
    {
        timevisited = a;
    }

    /**
     * Method to set the price of the property
     *
     * @param p is the value of the price
     */
    public void setprice(double p) //method that sets the price of the property to price in parameter p
    {
        price = p;
    }

    /**
     * Method to set the location of the property
     *
     * @param l is the new location
     */
    public void setlocation(String l) //method that sets the location of the property to location in parameter l
    {
        location = l;
    }

    /**
     * Method to set the number of rooms of the property
     *
     * @param n is this new number
     */
    public void setnumberroom(int n) //method that sets the number of rooms of the property to number rooms in parameter n
    {
        numberrooms = n;
    }

    /**
     * Method to set the number of floors of the property
     *
     * @param n is this new number
     */
    public void setnumberfloor(int n) //method that sets the number of floors of the property to number floor in parameter n
    {
        numberfloors = n;
    }

    /**
     * Method to set the surfaceof the house
     *
     * @param s is this new number
     */
    public void setsurface(double s) //method that sets the surface of the property to surface in parameter s
    {
        surface = s;
    }

    /**
     * Method to set the number of bedrooms of the house
     *
     * @param nb is this new number
     */
    public void setnumberbedroom(int nb) //method that sets the number of bedrooms of the property to numberbedrooms in parameter nb
    {
        numberbedrooms = nb;
    }

    /**
     * Method to set the description of the house
     *
     * @param d is the description
     */
    public void setdescription(String d) //method that sets the description of the property to description in parameter d
    {
        description = d;
    }

    //all these following methods are abstract and will be implmented in the subclasses apartment and house
    //It concerns all the specific attributes of house(gardensurface, swimmingpool) or apartment(elevator,floornumber,parking)
    /**
     * Method that returns if the property has an elevator access once
     * implemented
     *
     * @return true if it has or false if it has not
     */
    public abstract boolean getelevator();

    /**
     * Method that returns the floor number of the property(apartment
     * especially) once implemented
     *
     * @return the floornumber of the property
     */
    public abstract int getfloornumber();

    /**
     * Method that returns if the property has a parking access once implemented
     *
     * @return true if it has or false if it has not
     */
    public abstract boolean getparking();

    /**
     * Method that converts boolean from getelevator() method into an int for a
     * SQL request once implemented
     *
     * @return 1 if it is true and 0 otherwise
     */
    public abstract int getelevatorsql();

    /**
     * Method that converts boolean from getparking() method into an int for a
     * SQL request once implemented
     *
     * @return 1 if it is true and 0 otherwise
     */
    public abstract int getparkingsql();

    /**
     * Method that returns the gardensurface of the property once implemented
     *
     * @return the garden surface
     */
    public abstract double getgardensurface();

    /**
     * Method that says if the property has a swimming pool or not once
     * implemented
     *
     * @return true if it has 0 otherwise
     */
    public abstract boolean getswimmingpool();

    /**
     * Method that converts boolean from getswimmingpool() method into an int
     * for a SQL request once implemented
     *
     * @return 1 if it is true and 0 otherwise
     */
    public abstract int getswimmingpoolsql();

    /**
     * Method that sets the floor number to a particular value once implemented
     *
     * @param fn is the new floornumber
     */
    public abstract void setfloornumber(int fn);

    /**
     * Method that sets the boolean parking to a particular value once
     * implemented
     *
     * @param a is the new value of the boolean
     */
    public abstract void setparking(boolean a);

    /**
     * Method that sets if the property has an elevator access or not once
     * implemented
     *
     * @param a is the new value (boolean)
     */
    public abstract void setelevator(boolean a);

    /**
     * Method to set the garden surface of the property once implemented
     *
     * @param gs is the new value
     */
    public abstract void setgardensurface(double gs);

    /**
     * Method to set the swimmingpool boolean attribute to true or false
     *
     * @param a is the boolean sent to this method
     */
    public abstract void setswimmingpool(boolean a);
}
