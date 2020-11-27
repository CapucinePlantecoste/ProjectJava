/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

/**
 *
 * @author thoma
 */
public class Appartment extends Property {
    
    private boolean elevator;//attribute corresponding if there is an elevator or not 
    private int floornumber;
    private boolean parking;//attributes that were not in the property class
    
     public Appartment (int i,String d, double p, String l, int nr, int nbr, int nbf, int tv, double s,int ids,String t,boolean e, int fnb, boolean prkg)//Constructor
    {
        super(i,d,p,l,nr,nbr,nbf,tv,s, ids,t);//constructor of property
        elevator=e;
        floornumber=fnb;
        parking=prkg;
        
        
    }
     
     
     @Override
     public int getfloornumber()
     {
         return floornumber;
     }
     
     @Override
     public boolean getparking()
     {
         return parking;
     }
     
     @Override
     public boolean getelevator()
     {
         return elevator;
     }
     
     @Override
    public int getelevatorsql()
     {
        int a;
         if(this.getelevator()==true)
         {
            a=1; 
         }
         else
         {
             a=0;
         }
         return a;
     }
    
    @Override
    public int getparkingsql()
    {
        int a;
         if(this.getparking()==true)
         {
            a=1; 
         }
         else
         {
             a=0;
         }
         return a;
    }
    @Override
    public double getgardensurface()
    {
        return 1;
    }
    
     @Override
    public boolean getswimmingpool()
    {
        return true;
    }
    
    @Override
    public int getswimmingpoolsql()
    {
        return 1;
    }
}
