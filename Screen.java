import java.util.Scanner;

public class Screen{
	static Scanner scanner = new Scanner(System.in);
	private static final int[] screenSize = {16,100};
	private static final int[] dialougeSize = {16,30};
	private static final int[] center = {screenSize[0]/2,screenSize[1]/2};
	
	private String borderMaking(String input) {
		int length = (dialougeSize[1]-input.length())/2;
		String output = "\n+" + "-".repeat(dialougeSize[1]) + "+\n|" + " ".repeat(length) + input + " ".repeat(input.length()%2 == 0 ? length : length+1) + "|\n" + "+" + "-".repeat(dialougeSize[1]) + "+";
		return output;	
	}
	
	private String borderMaking(String input,int size) {
		int length = (size-input.length())/2;
		String output = "\n+" + "-".repeat(size-1) + "+\n|" + " ".repeat(length) + input + " ".repeat(input.length()%2 == 0 ? length : length) + "|\n" + "+" + "-".repeat(size-1) + "+";
		return output;	
	}
	
	private String centerAdjustment(String input) {
		int length = input.indexOf("\n", 1)-1;
		String output = /*"\n".repeat(center[0] - 2) + */input.replaceAll("\n", "\n"+" ".repeat(center[1]-length/2));
		return output;
	}
	
	public void printScreen(String input) {
		System.out.print(centerAdjustment(borderMaking(input)));
	}
	
	public void printScreen(String input,int size) {
		System.out.print(centerAdjustment(borderMaking(input,size)));
	}
	
	public void printScreenWithoutBorder(String input) {
		String newInput;
		if(input.length() >= 30) {newInput = input;}
		else {newInput = "+" + "-".repeat((input.length()%2 == 0 ? (dialougeSize[1]/2) : (dialougeSize[1]/2)-1) - (input.length()/2)) + input + "-".repeat((dialougeSize[1]/2) - (input.length()/2)) + "+";}
		int length = newInput.length()+1;
		String output = " ".repeat(center[1]-length/2) + newInput;
		System.out.print(output);
	}
	
	public void printScreenWithoutBorder(String input, int size) {
		String newInput;
		if(input.length() >= size) {newInput = input;}
		else {newInput = "+" + "-".repeat((input.length()%2 == 0 ? (size/2) : (size/2)-1) - (input.length()/2)) + input + "-".repeat((size/2) - (input.length()/2)) + "+";}
		int length = newInput.length()+1;
		String output = " ".repeat(center[1]-length/2) + newInput;
		System.out.print(output);
	}
	
	public void printScannerPoint() {
		int length = center[1]-dialougeSize[1]/2;
		System.out.println();
		String output = " ".repeat(length) + ">";
		System.out.print(output);
	}
	
	public void printItemsList(SalesItem[] list) {
		System.out.printf("\s%2s\s  \s\s\s%6s\s\s\s  %8s  \s%7s\s  %3s  %27s\r\n","ID","NAME","CATEGORY","B.PRICE","QU.","DETAILS");
		System.out.println("-".repeat(100));
		for(SalesItem i : list) {
			System.out.printf("%4d  %12s  %8s  %9.1f  %3d  %-54s\r\n",i.getId(),i.getName(),i.getSubCategory(),i.getPrice(),i.getQuantityInStock(),i.toString());
		}
	}
	
	public void menuPrinting() {
		System.out.println("\n");
		String[] menuElements = {"SHOW ITEMS IN STOCK (PRESS 1)", "BUY ITEM (PRESS 2)", "DELETE ITEM (PRESS 3)", "SHOW CURRENT BILL (PRESS 4)",
				"CONFIRM BUY & EXIT (PRESS 5)" };
		//String header = "+"+"-".repeat(15)+"MENU"+"-".repeat(15)+"+";
		printScreenWithoutBorder("MENU");
		for(int i = 0; i< menuElements.length; i++) {
			printScreen(menuElements[i]);
		}
	}
	
	private void cardItems(SalesItem[] list) {
		System.out.println();
		printScreenWithoutBorder(String.format("\s%2s\s  \s\s\s%6s\s\s\s  %8s  \s%7s\s\r\n","ID","NAME","CATEGORY","B.PRICE"));
		printScreenWithoutBorder("-".repeat(42));
		System.out.println();
		for(SalesItem i : list) {
			printScreenWithoutBorder(String.format("%4d  %12s  %8s  %9.1f\r\n",i.getId(),i.getName(),i.getSubCategory(),i.getPrice()));
		}
	}
	
	public void bill(Customer customer, SalesItem[] list,double gross) {
		printScreen("BILL",41);
		System.out.println();
		for(String s : customer.InfoForBill()) {
		printScreenWithoutBorder(s,41);
		System.out.println();}
		printScreenWithoutBorder("-".repeat(42));
		cardItems(list);
		System.out.println();
		printScreenWithoutBorder("-".repeat(42));
		String grossMessage = String.format("Gross = %9.2f" , gross);
		printScreen(grossMessage,41);
	}
	
}