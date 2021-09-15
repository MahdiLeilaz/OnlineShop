
public class Cart {
	private SalesItem[] buyeditem = new SalesItem[5];
	private static int count = 0;
	private double gross = 0.0;
	
	protected SalesItem[] getBuyeditem() {
		SalesItem[] subBuyeditem = new SalesItem[count];
		for(int i = 0; i < count; i++)
			subBuyeditem[i] = buyeditem[i];
		return subBuyeditem;
	}
	protected void setBuyeditem(SalesItem buyeditem) {
		if(count > 4) {
			new Screen().printScreenWithoutBorder("Your Cart is in its Maximum Capacity!");
			return;
		}
		if(buyeditem.getQuantityInStock() == 0) {
			new Screen().printScreenWithoutBorder("Not in stock!");
			return;
		}
		count++;
		gross += buyeditem.getPrice();
		//this.buyeditem[count-1] = new SalesItem();
		this.buyeditem[count-1] = buyeditem;
		buyeditem.soldOne();
	}
	protected void deletBuyedItem(SalesItem deletedItem) {
		int buyedIndex = -1;
		if(buyeditem[0] == null) {
			new Screen().printScreenWithoutBorder("No item in your cart!");
			return;
		}
		for(int i = 0; i < buyeditem.length; i++) {
			if(buyeditem[i] == deletedItem) {buyedIndex = i; break;}
			if(i == buyeditem.length-1 || buyeditem[i] == null) {
				new Screen().printScreenWithoutBorder("This item is not in your cart!!");
				return;
			}
		}
		count--;
		gross -= deletedItem.getPrice();
		buyeditem[buyedIndex].returnOne();
		buyeditem[buyedIndex] = null;
		int counter = 1;
		while(buyedIndex+counter < buyeditem.length) {
		if(buyeditem[buyedIndex+counter] != null) {
			buyeditem[buyedIndex+counter-1] = buyeditem[buyedIndex+counter];
			buyeditem[buyedIndex+counter] = null;
			counter++;
		}
		else break;
		}
	}
	protected static int getCount() {
		return count;
	}
	protected double getGross() {
		return gross;
	}
}
