package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RegistrationServices {

	private String firstName,lastName,email;
	
	public RegistrationServices(String firstname,String lastname,String Email) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.email=Email;
				
	}
	
	
	public void addusers() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nissan","root","admin");
		Statement st=con.createStatement();
		
		st.executeUpdate("insert into register values("+null+",'"+firstName+"','"+lastName+"','"+email+"')");
		System.out.println("registration succesful");
				
	}
	
	
	
	
	
}
