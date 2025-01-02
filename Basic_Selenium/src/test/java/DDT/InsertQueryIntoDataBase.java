package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertQueryIntoDataBase {

	public static void main(String[] args) throws Throwable {
		//step 1: register driver/load the mysql database
				Driver driverRef = new Driver();
				DriverManager.registerDriver(driverRef);
				
				//get connect to database
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium", "root", "Krishang@123");
				
				//create sql statement
				Statement statement = conn.createStatement();
				String Query =  "insert into studentInfo(id,first_name,last_name,address)values('2','mrityunjay','a','bangalore')";
				
				int result = statement.executeUpdate(Query);
				
				if(result==1)
				{
					System.out.println("data is created");
				}
				else
				{
					System.out.println("data is not created");
				}
	}

}
