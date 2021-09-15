
public class Customer {
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private long mobileNumbers;
	private String emailAddress;
	private Location address = new Location();
	protected void setUserName(String userName) {
		this.userName = userName;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	protected void setMobileNumbers(long mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	protected void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	protected void setAddressElements(String[] elements) {
		this.address.setState(elements[0]);
		this.address.setCity(elements[1]);
		this.address.setStreet(elements[2]);
		this.address.setPostalCode(elements[3]);
	}
	

	protected String getFirstName() {
		return firstName;
	}
	protected String getLastName() {
		return lastName;
	}
	protected long getMobileNumbers() {
		return mobileNumbers;
	}
	protected String getEmailAddress() {
		return emailAddress;
	}
	
	protected boolean userNameCheck(String input) {
		if(input.equals(this.userName)) return true;
		return false;
	}
	protected boolean passwordCheck(String input) {
		if(input.equals(this.password)) return true;
		return false;
	}
	
	public String[] InfoForBill() {
		String[] output = {(firstName != null ? firstName + " " : "")
				+ (lastName != null ? lastName : "") , String.valueOf(mobileNumbers) ,
				(address != null ? address.toString() : "")};
		return output;
	}
	
}
