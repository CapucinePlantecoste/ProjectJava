//this class implements all the function of the ViewingsDAO class
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Timestamp;

/**
 * Class VisitDAOImpl which implements VisitDAO
 *
 * @author thoma
 */
public class VisitDAOImpl implements VisitDAO {
//the class VisitDAO is an interface so we have to implement all its functions here

    /**
     * Method to register all the visits from the database
     *
     * @return an ArrayList that contains all those visits
     */
    @Override
    public ArrayList<Visit> registervisit() {
        //this method enables to get all the viewings contained in the database    
        Connection conn = null;
        ArrayList<Visit> visits = new ArrayList<>();
        //we create an arraylist of viewings to store them later
        try {
            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            String sqtStat1 = "SELECT * FROM visit";
            //We get the different values of the different columns of the table viewings
            ResultSet result = stmt.executeQuery(sqtStat1);
            //we execute the query 
            while (result.next()) {
                //we get ALL the values

                int a = result.getInt("idvisit");
                //First column of the table 
                int b = result.getInt("idbuyer");
                int c = result.getInt("idemployee");
                int d = result.getInt("idproperty");
                int e = result.getInt("idbuyer");
                Timestamp ts = result.getObject("schedule", Timestamp.class);
                int f = result.getInt("duration");

                visits.add(new Visit(a, b, d, c, ts, f));
                //we create a viewing object with the values get ahead

            }
            conn.close();
            //always close the connection

        } catch (SQLException e) {
            //Possible MY SQL exception 
            System.err.println(e);
        }
        return visits;
        //we return the arraylist of viewings stored from the connection
    }

    /**
     * Method that adds a visit to the databas
     *
     * @param a is the Visit that is about to be added
     */
    @Override
    public void addvisit(Visit a) {
        //this method enables us to add a viewing into the database
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {

                stmt.executeUpdate("INSERT INTO visit " + " (idvisit,schedule, idemployee, idbuyer, idproperty,duration) " + "VALUES" + "('" + a.getid() + "','" + a.gettime() + "','" + a.getidemp() + "',null,'" + a.getidprop() + "','" + a.getduration() + "' )");
                //we add new values for a new visit into the database through this sql query 
                //When it is added a viewing doesn't have a buyer that wants to visit it yet so we put null for the idbuyer attribute
                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //always clsoe the connection
            } catch (SQLException f) {
                //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
            //Possible MySql connection exception
            System.err.println(e);
        }

    }

    /**
     * Method that deletes a viewing from the database when the visit has been
     * done
     *
     * @param a is the Visit to delete
     */
    @Override
    public void deleteviewing(Visit a) {
        //method that deletes the viewiing from the database 
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {

                stmt.executeUpdate("Delete from visit where idvisit='" + a.getid() + "';");
                //we delete the correponding values from the table visit through this sql query
                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //always close the connection
            } catch (SQLException f) {
                //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
            //Possible MySql connection exception
            System.err.println(e);
        }
    }

    /**
     * Method to update the id of the buyer (and so the buyer) who does the
     * visit
     *
     * @param a is the Visit considered
     */
    @Override
    public void updatebuyer(Visit a) //method that enables us to update the buyer of the viewing 
    {
        Connection conn = null;
        try {

            DataSource db = new DataSource();
            //we create an object of dataSource, in order to connect to the database
            conn = db.createConnection();
            //we create and establish the connection
            Statement stmt = conn.createStatement();
            //we create a statement to dialog with the database

            conn.setAutoCommit(false);
            // we group multiple Statements under the same transaction. This transaction will be committed when "commit()" invoked
            try {

                stmt.executeUpdate("UPDATE visit SET idbuyer='" + a.getidbuyer() + "' where idvisit='" + a.getid() + "';");
                //as we said before a viewing doesn't have a buyer that wants to visit the property at the begining but when a buyer books this viewing we have to update the idbuyer field of the viewing
                conn.commit();
                //COMMIT statement to the MySQL server
                conn.close();
                //always close the connection

            } catch (SQLException f) {
                //possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {
            //Possible MySql connection exception
            System.err.println(e);
        }
    }

}
