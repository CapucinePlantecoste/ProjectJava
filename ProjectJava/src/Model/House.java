/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Property;

/**
 *
 * @author thoma
 */
public class House extends Property {
    
    private double gardensurface;//Attributes that do not exist in the Property class
    private boolean swimmingpool;
    
    public House(int i,String d, double p, String l, int nr, int nbr, int nbf, int tv, double s,int ids, boolean soldprop,String t, double gs, boolean sp)//Constructor
    {
        super(i,d,p,l,nr,nbr,nbf,tv,s,ids,soldprop,t);//constructor of the property class
        gardensurface=gs;
        swimmingpool=sp;
    }
    @Override
    public double getgardensurface()
    {
        return gardensurface;
    }
    
    @Override
    public boolean getswimmingpool()
    {
        return swimmingpool;
    }
    
    @Override
    public boolean getelevator()
    {
        return true;
    }
    
    @Override
    public boolean getparking()
    {
        return true;
    }
    @Override
    public int getfloornumber()
    {
        return 1;
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
    public int getswimmingpoolsql()
    {
        int a;
        if(this.getswimmingpool()==true)
        {
            a=1;
        }
        else
        {
            a=0;
        }
        return a;
    }
}
