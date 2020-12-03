//this class is the class person, the superclass of the classes customer and employee
package Model;

/**
 *
 * @author thoma
 */
public abstract class Person {
    
    //All the attributes that are common to a buyer, a seller or an employee
    private String name;
    private String familyname;
    private String username;
    private String password;
    private int id;
    
    
    public Person(int i,String n, String fn, String u, String p)
    //constructor 
    {
        id=i;
        name=n;
        familyname=fn;
        username=u;
        password=p;
    }
    
    
    public String getusername()
    //method to get the username of the person
    {
        return username;
    }
    public String getpassword()
    //function to get the password of the person
    {
        return password;
    }
    public String getname()
    //function to get the name of the person
    {
        return name;
    }
    public String getfamilyname()
    //function to get the family name of the person
    {
        return familyname;
    }
    
    public void setusername( String u)
    //function to set the username of the person to username in parameter u
    {
        username=u;
    }
     public void setpassword( String p)
    //function to set the password of the person to password in paramater p 
    {
        password=p;
    }
      public void setname( String n)
    //function to set the name of the person to name in parameter n
    {
        name=n;
    }
      public void setfamilyname(String fn)
    //function to set the family name of the person to family name in parameter fn
      {
          familyname=fn;
      }
      public int getid()
      //function to get the id of the person
      {
          return id;
      }
      //public abstract void display();//Overwritten function in the subclasses
}
