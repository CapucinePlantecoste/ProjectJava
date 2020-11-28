/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Timestamp;
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
    
    public Visit(int i, int idb, int idp, int ide, Timestamp t)
    {
        id=i;
        idbuyer=idb;
        idprop=idp;
        idemp=ide;
        ts=t;
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
    
    public void displaydate()
    {
        System.out.println(ts.toString());
    }
    /*public java.sql.Date getdate()
    {
        return d;
    }*/
    
}
