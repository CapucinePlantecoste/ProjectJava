//this class is the house class, which is a subclass of property, so we extend all the property attributes and methods

package Model;

import Model.Property;

/**
 *
 * @author thoma
 */
public class House extends Property {//House extends the superclass property
    
    //these two following attributes are not present in the property class    
    private double gardensurface;//Attributes that do not exist in the Property class
    private boolean swimmingpool;//boolean that corresponds to if there is a swmming pool or not 
    
    public House(int i,String d, double p, String l, int nr, int nbr, int nbf, int tv, double s,int ids, boolean soldprop,String t, double gs, boolean sp)//Constructor
    {//constructor of the house class
        super(i,d,p,l,nr,nbr,nbf,tv,s,ids,soldprop,t);//constructor of the property class
        gardensurface=gs;
        swimmingpool=sp;
    }
    @Override
    public double getgardensurface()//getter to obtain the garden surface
    {
        return gardensurface;
    }
    
    @Override
    public boolean getswimmingpool()//getter to obtain the boolean of the swimming pool
    {
        return swimmingpool;
    }
    
    @Override
    public boolean getelevator()//getter to obtain the boolean of the elevator 
    {
        return true;
    }
    
    @Override
    public boolean getparking()//we set this value to a random value (here true) 
    {
        return true;
    }
    @Override
    public int getfloornumber()//we set this value to a random value (here 1)
    {
        return 1;
    }
    @Override
    public int getelevatorsql()//in my sql, we cannot set the value of a boolean to true or false, we need to set 0 or 1
     {
        int a;
         if(this.getelevator()==true)//if there is an elevator
         {
            a=1; //we set the value to 1
         }
         else//otherwise
         {
             a=0;//we set the value to 0
         }
         return a;
     }
    @Override
    public int getparkingsql()//in my sql, we cannot set the value of a boolean to true or false, we need to set 0 or 1
    {
        int a;
         if(this.getparking()==true)//if there is a parking
         {
            a=1; //we set the value to 1
         }
         else//otherwise
         {
             a=0;//we set the value to 0
         }
         return a;
    }
    
    @Override
    public int getswimmingpoolsql()//in my sql, we cannot set the value of a boolean to true or false, we need to set 0 or 1
    {
        int a;
        if(this.getswimmingpool()==true)
        {
            a=1;//we set the value to 1
        }
        else//otherwise
        {
            a=0;//we set the value to 0
        }
        return a;
    }
}
