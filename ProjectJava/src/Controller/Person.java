/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author thoma
 */
public abstract class Person {
    
    private String name;//All the attributes that are common to a buyer, a seller or an employee
    private String familyname;
    private String username;
    private String password;
    private int id;
    
    
    public Person(int i,String n, String fn, String u, String p)//constructor 
    {
        id=i;
        name=n;
        familyname=fn;
        username=u;
        password=p;
        
    }
    
    public abstract void display();//Overwritten function in the subclasses
    
    
    
    public String getusername()//function to get the username of the person
    {
        return username;
    }
    public String getpassword()//function to get the password of the person
    {
        return password;
    }
    public String getname()//function to get the name of the person
    {
        return name;
    }
    public String getfamilyname()//function to get the family name of the person
    {
        return familyname;
    }
    
    public void setusername( String u)//function to set the username of the person
    {
        username=u;
    }
     public void setpassword( String p)//function to set the password of the person
    {
        password=p;
    }
      public void setname( String n)//function to set the name of the person
    {
        name=n;
    }
      public void setfamilyname(String fn)//function to set the family name of the person
      {
          familyname=fn;
      }
      public int getid()
      {
          return id;
      }
}