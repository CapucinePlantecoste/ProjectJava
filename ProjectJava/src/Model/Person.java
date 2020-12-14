//this class is the class person, the superclass of the classes buyer seller and employee
package Model;

/**
 * Abstract Class Person
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

    /**
     * Constructor of the class Person
     *
     * @param i which is the id of the peron
     * @param n which is the name of the person
     * @param fn which is the family name of the person
     * @param u which is the username of the person
     * @param p which is the password of the person
     */
    public Person(int i, String n, String fn, String u, String p) //constructor 
    {
        id = i;
        name = n;
        familyname = fn;
        username = u;
        password = p;
    }

    /**
     * Method to get the username of the person
     *
     * @return the username of the person
     */
    public String getusername() //method to get the username of the person
    {
        return username;
    }

    /**
     * Method to get the password of the person
     *
     * @return the password of the person
     */
    public String getpassword() //function to get the password of the person
    {
        return password;
    }

    /**
     * Method to get the name of the person
     *
     * @return the name of the person
     */
    public String getname() //function to get the name of the person
    {
        return name;
    }

    /**
     * Method to get the familyname of the person
     *
     * @return the familyname of the person
     */
    public String getfamilyname() //function to get the family name of the person
    {
        return familyname;
    }

    /**
     * Method to set the username of the person
     *
     * @param u which is the new username
     */
    public void setusername(String u) //function to set the username of the person to username in parameter u
    {
        username = u;
    }

    /**
     * Method to set the password of the person
     *
     * @param p which is the new password
     */
    public void setpassword(String p) //function to set the password of the person to password in paramater p 
    {
        password = p;
    }

    /**
     * Method to set the name of the person
     *
     * @param n which is the name
     */
    public void setname(String n) //function to set the name of the person to name in parameter n
    {
        name = n;
    }

    /**
     * Method to set the family name of a person
     *
     * @param fn which is the new family name
     */
    public void setfamilyname(String fn) //function to set the family name of the person to family name in parameter fn
    {
        familyname = fn;
    }

    /**
     * Method to get the id of the person
     *
     * @return the id of the person
     */
    public int getid() //function to get the id of the person
    {
        return id;
    }

}
