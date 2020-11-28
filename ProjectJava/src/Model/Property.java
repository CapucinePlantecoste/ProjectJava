/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author thoma
 */
public abstract class Property {
    
    private int id;//All the attributes that are common to a house and an apartment 
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
    public Property(int i,String d, double p, String l, int nr, int nbr, int nbf, int tv, double s, int ids, String t)//Constructor
    {
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
        sold=false;
    }
    
    public int getidseller()
    {
        return idseller;
    }
    
    public String getdescription()
    {
        return description;
    }
    public double getprice()
    {
        return price;
        
    }
    
    public int getnumberrooms()
    {
        return numberrooms;
    }
    public int getnumberbedrooms()
    {
        return numberbedrooms;
    }
    public int gettimevisited()
    {
        return timevisited;
    }
    public int getnumberfloors()
    {
        return numberfloors;
    }
    public double getsurface()
    {
        return surface;
    }
    public String getlocation()
    {
        return location;
    }
    public String gettype()
    {
          return type;
    }
    
    public void setsold(boolean a)
    {
        sold=a;
    }
    public boolean getsold()
    {
        return sold;
    }
    
    public int getid()
    {
        return id;
    }
    public void setid( int a)
    {
        id=a;
    }
    
    public abstract boolean getelevator();
    public abstract int getfloornumber();
    public abstract boolean getparking();
    public abstract int getelevatorsql();
    public abstract int getparkingsql();
    public abstract double getgardensurface();
    public abstract boolean getswimmingpool();
    public abstract int getswimmingpoolsql();
}
