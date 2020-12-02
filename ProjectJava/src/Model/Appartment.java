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
    private boolean parking;//attributes that were not in the property class
    
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
         else//oterwise, it is equal to 0
         {
             a=0;
         }
         return a;
    }
    
    @Override
    public double getgardensurface()//we have to override this method so we set a fixed value 
    {
        return 1;
    }
    
     @Override
    public boolean getswimmingpool()//we have to override this method so we set a fixed value 
    {
        return true;
    }
    
    @Override
    public int getswimmingpoolsql()//in MySQL, we cannot asign a boolean to true or false, so we give it fixed value of 1
    {
        return 1;
    }
}