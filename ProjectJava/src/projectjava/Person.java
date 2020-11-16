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
public abstract class Person {
    
    private String name;
    private String familyname;
    private String username;
    private String password;
    private int id;
    
    public Person(String n, String fn, String u, String p, int i)
    {
        name=n;
        familyname=fn;
        username=u;
        password=p;
        id=i;
    }
    
    public abstract void display();
    
    public int getid()
    {
        return id;
    }
    
    public void setid(int i)
    {
        id=i;
    }
    
    public String getusername()
    {
        return username;
    }
    public String getpassword()
    {
        return password;
    }
    public String getname()
    {
        return name;
    }
    public String getfamilyname()
    {
        return familyname;
    }
    
    public void setusername( String u)
    {
        username=u;
    }
     public void setpassword( String p)
    {
        password=p;
    }
      public void setname( String n)
    {
        name=n;
    }
      public void setfamilyname(String fn)
      {
          familyname=fn;
      }
}
