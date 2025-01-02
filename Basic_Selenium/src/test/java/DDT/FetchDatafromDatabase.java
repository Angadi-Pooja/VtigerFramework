package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDatafromDatabase {

	public static void main(String[] args) throws Throwable {
		
		//step 1: register driver/load the mysql database
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		//get connect to database
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium", "root", "Krishang@123");
		
		//create sql statement
		Statement statement = conn.createStatement();
		String Query =  "select*from studentInfo";
		
		//execute statement/query
		ResultSet result = statement.executeQuery(Query);
		
		while(result.next())
		{
			System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4));
			
		}
		conn.close();
	}	
}
