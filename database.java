package employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nisa Muziyawati
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee", "root", "");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
