
public class PrintedItems extends SalesItem {
	private final Categories category = Categories.PRINTED_ITEMS;
	private int numberOfPages;
	protected PrintedItems(double price, int quantityInStock, String name) {
		super(price, quantityInStock, name);
	}
	protected int getNumberOfPages() {
		return numberOfPages;
	}
	protected void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	protected Categories getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return ", Pages=" + numberOfPages + "]";
	}
}
