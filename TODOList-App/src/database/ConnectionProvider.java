
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionProvider {
    
    public static Connection con;
    public static Statement st;
    static{
    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/todo_List", "root", "Root123");
        st=con.createStatement();
     }catch(Exception e){

      }
    }
}
