package pojo;

public class LoginRequest {

	private String userEmail;                   //SERIALIZATION: (Converting a Java Object to Request Body By: (i)Declare variable of each key in the sample body(payload)
	private String userPassword;
	
	
	public String getUserEmail() {                  //(ii)Create Getters & Setters by Highlighting the variables->right click->Source-> Generate Getters & Setters (These 2 stepas become the POJO CLASS)
		return userEmail;
	}												//Note: The Java Object is not created on this page. It is created to set the values in the test page
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;					//(iii) Create an object of the POJO Classes 
	}
	public String getUserPassword() {				// Set your values
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
