
public class SalesItem {
	public static final int startingId = 1000;
	private static int id = startingId;
	private double price;
	private int quantityInStock;
	private String name;
	private int itemId;
	private String subCategory;
	
	protected SalesItem() {}
	
	protected SalesItem(double price, int quantityInStock, String name) {
		this.price = price;
		this.quantityInStock = quantityInStock;
		this.name = name;
		this.itemId = id;
		++id;
	}
	protected int getId() {
		return itemId;
	}
	protected double getPrice() {
		return price;
	}
	protected int getQuantityInStock() {
		return quantityInStock;
	}
	protected void soldOne() {
		this.quantityInStock--;
	}
	protected void returnOne() {
		this.quantityInStock++;
	}
	protected String getName() {
		return name;
	}
	public static int getCount() {
		return id-startingId;
	}
	protected String getSubCategory() {
		return subCategory;
	}
	protected void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
}
