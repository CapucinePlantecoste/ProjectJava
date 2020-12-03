/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Timestamp;

/**
 *
 * @author thoma
 */
public class Visit {
    
    private int id;
   // private java.sql.Date d;
    private int idbuyer;
    private int idprop;
    private int idemp;
    Timestamp ts;
    private int duration;
    
    public Visit(int i, int idb, int idp, int ide, Timestamp t, int d )
    {
        id=i;
        idbuyer=idb;
        idprop=idp;
        idemp=ide;
        ts=t;
        duration=d;
    }
    
    public int getidbuyer()
    {
        return idbuyer;
    }
    
    
    
    public int getidprop()
    {
        return idprop;
    }
    
    public int getidemp()
    {
        return idemp;
    }
    
    public String displaydate()
    {
        return ts.toString();
    }
    public Timestamp gettime()
    {
        return ts ; 
    }
    
    public int getduration()
    {
        return duration;
    }
    
    public int getid()
    {
        return id;
    }
    
    public void setidbuyer(int idb)
    {
        idbuyer=idb;
    }
    /*public java.sql.Date getdate()
    {
        return d;
    }*/
    
}
