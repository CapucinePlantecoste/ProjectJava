/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Person;

/**
 *
 * @author CAP
 */
public abstract class Customer extends Person{//Customer class represents both byuers and sellers 
    
    public Customer(int i,String n, String fn, String u, String p)//constructor 
    {
        super(i,n,fn,u,p);//constructor of the Person class 
    }
    
}
