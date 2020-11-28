/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Person;

/**
 *
 * @author thoma
 */
public class Employee extends Person {//Employee is a derived class of Person
    
    public Employee(int i,String n, String fn, String u, String p)//COnstructor 
    {
        super(i,n,fn,u,p);//constructor of the Person class
    }
    
    @Override
    public void display()
    {
        
    }
    
}
