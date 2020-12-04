//this class is the class property, the superclass of apartment and house
package Model;

/**
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
    
    public Property(int i,String d, double p, String l, int nr, int nbr, int nbf, int tv, double s, int ids, boolean soldprop,String t)//Constructor
    {
        //constructor of property, this constructor will also be called in apartment and house classes with super(..)
        id=i;
        description=d;
        price=p;
        location=l;
        numberrooms=nr;
        numberbedrooms=nbr;
        numberfloors=nbf;
        timevisited=tv;
        surface=s;
        idseller=ids;
        type=t;
        sold=soldprop;
    }
    
    public int getidseller()
    //method to get the id of the seller of the property
    {
        return idseller;
    }
    
    public String getdescription()
    //method to get the description of the property
    {
        return description;
    }
    public double getprice()
    //method to get the price of the property
    {
        return price;        
    }
    
    public int getnumberrooms()
    //method to get the number of rooms of the property
    {
        return numberrooms;
    }
    public int getnumberbedrooms()
    //method to get the number of bedrooms of the property
    {
        return numberbedrooms;
    }
    public int gettimevisited()
    //method to get the number of visits of the property
    {
        return timevisited;
    }
    public int getnumberfloors()
    //method to get the number of floors of the property
    {
        return numberfloors;
    }
    public double getsurface()
    //method to get the surface of the property
    {
        return surface;
    }
    public String getlocation()
    //method to get the location of the seller of the property
    {
        return location;
    }
    public String gettype()
    //method to get the type of the property : depending on if it is a house or an apartment
    {
          return type;
    }
    
    public void setsold(boolean a)
    //method to set the boolean of the property to 1 if it is sold and to 0 otherwise 
    {
        sold=a;
    }
    public boolean getsold()
    //method to get the boolean to know if the property has been sold or not 
    {
        return sold;
    }
    
    public int getid()
    //method to get the id of the property
    {
        return id;
    }
    public void setid( int a)
    //method that sets the id of the property to id in parameter a
    {
        id=a;
    }
    
    public void settimevisited(int a )
    //method that sets the times visisted of the property to times visites in parameter s
    {
        timevisited=a;
    }
    
    public void setprice(double p)
    //method that sets the price of the property to price in parameter p
    {
        price=p;
    }
    public void setlocation(String l)
    //method that sets the location of the property to location in parameter l
    {
        location=l;
    }
    
    public void setnumberroom(int n)
    //method that sets the number of rooms of the property to number rooms in parameter n
    {
        numberrooms=n;
    }
    
    public void setnumberfloor(int n)
    //method that sets the number of floors of the property to number floor in parameter n
    {
        numberfloors=n;
    }
    
    public void setsurface(double s)
    //method that sets the surface of the property to surface in parameter s
    {
        surface=s;
    }
    
    public void setnumberbedroom(int nb)
    //method that sets the number of bedrooms of the property to numberbedrooms in parameter nb
    {
        numberbedrooms=nb;
    }
    public void setdescription(String d)
    //method that sets the description of the property to description in parameter d
    {
        description=d;
    }
    
    //all these following methods are abstract and will be implmented in the subclasses apartment and house
    //It concerns all the specific attributes of house(gardensurface, swimmingpool) or apartment(elevator,floornumber,parking)
    public abstract boolean getelevator();
    public abstract int getfloornumber();
    public abstract boolean getparking();
    public abstract int getelevatorsql();
    public abstract int getparkingsql();
    public abstract double getgardensurface();
    public abstract boolean getswimmingpool();
    public abstract int getswimmingpoolsql();
    public abstract void setfloornumber(int fn);
    public abstract void setparking(boolean a);
    public abstract void setelevator(boolean a);
    public abstract void setgardensurface(double gs);
    public abstract void setswimmingpool(boolean a);
}
