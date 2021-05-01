package Project;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	 public static Connection getCon(){
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project1","root","");
	            return con;
	        }catch(Exception e)
	        {
	            System.out.println(e);
	            return null;
	     }

	 }
}
	
