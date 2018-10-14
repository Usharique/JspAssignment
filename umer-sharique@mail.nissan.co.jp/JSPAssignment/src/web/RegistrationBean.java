package web;


public class RegistrationBean {

	private String firstName,lastName,email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void regsiter() throws Exception
	{
		RegistrationServices regs=new RegistrationServices(firstName, lastName, email);
		regs.addusers();
		
	}
	
}
