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
public class Buyer extends Customer{
    
    
    
    public Buyer(int i,String n, String fn, String u, String p)//no more attributes than in the customer class
    {
        super(i,n,fn,u,p);//constructor of customer class
    }
    
    @Override
    public void display()
    {
        //affichage à voir apres
    }
    
   
}