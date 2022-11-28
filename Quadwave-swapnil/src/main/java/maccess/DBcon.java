package maccess;
import java.sql.*;
public class DBcon {
	private static Connection con = null; 
	private DBcon() {}
	static{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/swapnil","swapnil","swapnil");
		}
		catch(Exception e) {e.printStackTrace();}
	}
	public static Connection getCon(){
		return con; 
	}
}
