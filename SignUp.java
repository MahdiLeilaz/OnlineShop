import java.util.Scanner;

public class SignUp {
	private Screen screen = new Screen();
	Scanner scanner = new Scanner(System.in);
	Customer customer = new Customer();
	public Customer welcome() {
		int answer = -1;
		String enteredWord;
		boolean isContinue = true;
		screen.printScreen("Sign Up");
		while(isContinue) {
			System.out.println();
		screen.printScreenWithoutBorder("Do you want to sing up?");
		System.out.println();
		screen.printScreenWithoutBorder("(1)Yes (2)No");
		screen.printScannerPoint();
		try {answer = scanner.nextInt(); if(answer == 1 || answer == 0) isContinue = false; break;}
		catch(Exception e){scanner.nextLine(); screen.printScreenWithoutBorder("Not Valid !");}}
		if(answer == 0) return null;
		screen.printScreen("User Name");
		screen.printScannerPoint();
		customer.setUserName(scanner.next());
		screen.printScreen("Password");
		screen.printScannerPoint();
		customer.setPassword(scanner.next());
		System.out.println("\n\n\n\n\n\n");
		screen.printScreenWithoutBorder("Enter your first name");
		screen.printScannerPoint();
		customer.setFirstName(scanner.next());
		screen.printScreenWithoutBorder("Enter your last name");
		screen.printScannerPoint();
		customer.setLastName(scanner.next());
		isContinue = true;
		while(isContinue) {
		if(scanner.hasNextLine()) scanner.nextLine();
		screen.printScreenWithoutBorder("Enter your EMail address");
		screen.printScannerPoint();
		enteredWord = scanner.next();
		if(enteredWord.contains("@") && enteredWord.contains(".")) {
		customer.setEmailAddress(enteredWord);
		isContinue = false;}
		else {scanner.nextLine(); screen.printScreenWithoutBorder("Not Valid !");}
		}
		isContinue = true;
		while(isContinue) {
		if(scanner.hasNextLine()) scanner.nextLine();
		screen.printScreenWithoutBorder("Enter your moblie numbers");
		screen.printScannerPoint();
		try {customer.setMobileNumbers(scanner.nextLong()); isContinue = false; break;}
		catch(Exception e) {scanner.nextLine(); screen.printScreenWithoutBorder("Not Valid !");}}
		screen.printScreenWithoutBorder("Which state are you living");
		screen.printScannerPoint();
		String[] address = new String[4];
		address[0] = scanner.next();
		screen.printScreenWithoutBorder("Which city are you living");
		screen.printScannerPoint();
		address[1] = scanner.next();
		screen.printScreenWithoutBorder("Which street are you living");
		screen.printScannerPoint();
		address[2] = scanner.next();
		screen.printScreenWithoutBorder("What is your postal code");
		screen.printScannerPoint();
		address[3] = scanner.next();
		customer.setAddressElements(address);
		scanner.nextLine();
		screen.printScreen("Your Account Is Seted!");
		System.out.println();
		screen.printScreenWithoutBorder("Press Enter to transfer to our shop");
		scanner.nextLine();
		System.out.println();
		
		return customer;
	}
}
