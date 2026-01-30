
package projetoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author RYANGABRIELDAROSA
 */
public class ConnectionDB {
    
     public static Connection getConnection() throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/danonations";
        String user = "root";
        String password = "Root";
        //Mudar senha caso mexam em casa
        
        return DriverManager.getConnection(url,user,password);
    }
   
}
