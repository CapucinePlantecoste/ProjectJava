/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class VisitDAOImpl implements VisitDAO {
    
    @Override
    public ArrayList<Visit> registervisit()
    {
        Connection conn = null;
        ArrayList<Visit> visits = new ArrayList<Visit>();
        try {
            DataSource db = new DataSource();
            conn = db.createConnection();
            Statement stmt = conn.createStatement();

            String sqtStat1 = "SELECT * FROM visit";//We get the different values of the different columns of the table employee
            ResultSet result = stmt.executeQuery(sqtStat1);//we execute the query 
            while (result.next()) {

                int a = result.getInt("idvisit");//First column of the table 
                int b  = result.getInt("idbuyer");
                int c= result.getInt("idemployee");
                int d = result.getInt("idproperty");
                int e = result.getInt("idbuyer");

                visits.add(new Visit(a, b, d, c));//we create an employee object with the values get ahead

            }
            conn.close();

        } catch (SQLException e) {//Possible MY SQL exception 
            System.err.println(e);
        }
        return visits;
    }
    @Override
    public void addvisit(Visit a)
    {
        
    }
    
        
        
}
