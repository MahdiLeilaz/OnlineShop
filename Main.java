
public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new SignUp().welcome();
		new Menu(customer).menu();
		
	}
	
}
