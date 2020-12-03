//This class represents the apartments, which are a subclass of the property class, so we extend all the property methods and attributes
package Model;

/**
 *
 * @author thoma
 */
public class Appartment extends Property {//Apartment extends the superclass property
    
    //these three following attributes are not present in the property class
    private boolean elevator;//attribute corresponding to if there is an elevator or not 
    private int floornumber;//The floor number of the apartments
    private boolean parking;//Parking available or not
    
     public Appartment (int i,String d, double p, String l, int nr, int nbr, int nbf, int tv, double s,int ids, boolean soldprop,String t,boolean e, int fnb, boolean prkg)//Constructor
    {//constuctor of the apartment class
        super(i,d,p,l,nr,nbr,nbf,tv,s, ids,soldprop,t);//constructor of property
        elevator=e;
        floornumber=fnb;
        parking=prkg;        
    }     
     
     @Override
     public int getfloornumber()//getter to obtain the floor number
     {
         return floornumber;
     }
     
     @Override
     public boolean getparking()//getter to obtain if there is a parking
     {
         return parking;
     }
     
     @Override
     public boolean getelevator()//getter to obtain if there is an elevator
     {
         return elevator;
     }
     
     @Override
    public int getelevatorsql()//in MySQL, we cannot asign a boolean to true or false, so we give it the 0 or 1 value
     {
        int a;
         if(this.getelevator()==true)//if there is an elevator, the boolean is true, 
         {
            a=1; //so we set the value to 1
         }
         else//oterwise, it is equal to 0
         {
             a=0;
         }
         return a;
     }
    
    @Override
    public int getparkingsql()//in MySQL, we cannot asign a boolean to true or false, so we give it the 0 or 1 value
    {
        int a;
         if(this.getparking()==true)//if there is a parking, the boolean is true,
         {
            a=1; //so we set the value to 1
         }
         else//otherwise, it is equal to 0
         {
             a=0;
         }
         return a;
    }
    
    //Sometimes in this project we deal with a property (without knowing if it is a property or a house) so we have to put abstract methods for attributes that are specific to apartment or house
    // But sometimes we know that we won't use them
    // For example, an apartment doesn't have the attribute gardensurface but we have to override the mehtod getgardensurface so we just put a random value in this get but this fonction will never be used
    @Override
    public double getgardensurface()//we have to override this method but we won't use it for an apartment so we return 1 but it will never be used
    {
        return 1;
    }
    
     @Override
    public boolean getswimmingpool()//we have to override this method so we set a fixed value but we won't use it as well
    {
        return true;
    }
    
    @Override
    public int getswimmingpoolsql()//FUnction that is used in House but not in this class
    {
        return 1;
    }
    
    @Override//FUnction that is used in House but not in this class
    public void setgardensurface(double s)
    {
        
    }
    
    //FUnction that is used in House but not in this class
    @Override
    public void setswimmingpool(boolean a)
    {
        
    }
    
    //This function is to set a floornumber from a given value
    @Override
    public void setfloornumber(int fn)
    {
        floornumber=fn;
    }
    
    //This function is to set the boolean parking from a given boolean
    @Override
    public void setparking(boolean a)
    {
        parking=a;
    }
    
    //This function is to set the boolean elevator from a given boolean
    @Override
    public void setelevator(boolean a)
    {
        elevator=a;
    }
    
}