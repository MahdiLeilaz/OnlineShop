
public class Location {
	private String state;
	private String city;
	private String street;
	private String postalCode;
	
	protected void setState(String state) {
		this.state = state;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	protected void setStreet(String street) {
		this.street = street;
	}
	protected void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return (state != null ? state + ", " : "") + (city != null ? city + ", " : "")
				+ (street != null ? street + ", " : "") + postalCode;
	}
}
