import java.util.Scanner;


public class Menu {

	int count = 0;
	static Scanner scanner = new Scanner(System.in);
	static Screen screen = new Screen();
	ObjectBuilder objects = new ObjectBuilder();
	Cart cart = new Cart();
	Customer customer;
	
	protected Menu(Customer customer) {
		this.customer = customer;
	}

	public void menu() {
		objects.start();
		boolean isContinue = true;
		int choice = 0;
		while (isContinue) {
			System.out.println();
			new Screen().menuPrinting();
			new Screen().printScannerPoint();
			while(true) {
			try{choice = scanner.nextInt(); break;}
			catch(Exception e) {scanner.nextLine(); screen.printScreenWithoutBorder("Not Valid !");}}
			switch (choice) {
			case 1:
				{screen.printItemsList(objects.getItemsList());
				scanner.nextLine();}
				break;
			case 2:
				buyItem();
				break;
			case 3:
				deleteItem();
				break;
			case 4:
				screen.bill(customer, cart.getBuyeditem(), cart.getGross());
				break;
			case 5:{
				screen.printScreen("THANK YOU FOR SHOPPING");
				isContinue = false;}
				return;
			default:
				screen.printScreenWithoutBorder("Not Valid!");
			}
		}
	}

	private void buyItem() {
		screen.printScreenWithoutBorder("Enter the ID of item : ");
		screen.printScannerPoint();
		int itemId = scanner.nextInt();
		for(int i = 0; i < objects.getItemsList().length; i++) {
		if(itemId == objects.getItemsList()[i].getId()) {
		cart.setBuyeditem(objects.getItemsList()[i]);
		return;}
		}
		screen.printScreenWithoutBorder("Not Valid!");
	}
	
	private void deleteItem() {
		screen.printScreenWithoutBorder("Enter the ID of item : ");
		screen.printScannerPoint();
		int itemId = scanner.nextInt();
		for(int i = 0; i < objects.getItemsList().length; i++) {
			if(itemId == objects.getItemsList()[i].getId()) {
			cart.deletBuyedItem(objects.getItemsList()[i]);
			return;}
			}
			screen.printScreenWithoutBorder("Not Valid!");
	}
}