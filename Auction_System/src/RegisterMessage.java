
//message sent when a user wants to register
public class RegisterMessage extends Message
{
	//credentials of the user
	private String famName;
	
	private char[] password;
	
	//constructor
	public RegisterMessage(String u, char[] pass, String fn)
	{
		super(u);
		
		this.password = pass;
		this.famName = fn;
	}
	
	//getter for password
	public char[] getPassword()
	{
		return this.password;
	}
	
	//getter for user name
	public String getFamilyName()
	{
		return this.famName;
	}
	

	
}
