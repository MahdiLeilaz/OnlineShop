
public class Shoe extends SalesItem {
	private String subCategory = "Shoe";
	protected enum shoeTypes{formal,sport};
	protected enum colorTypes{white,black,multicolor,brown};
	private String shoeType;
	private int size;
	private String color;
	protected Shoe(double price, int quantityInStock, String name) {
		super(price, quantityInStock, name);
		super.setSubCategory(this.subCategory);
		super.setSubCategory(this.subCategory);
	}
	protected String getShoeType() {
		return shoeType;
	}
	protected void setShoeType(shoeTypes shoeType) {
		this.shoeType = shoeType.name();
	}
	protected int getSize() {
		return size;
	}
	protected void setSize(int size) {
		this.size = size;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(colorTypes color) {
		this.color = color.name();
	}
	@Override
	public String toString() {
		return "[" + (shoeType != null ? "shoeType=" + shoeType + ", " : "") + "size=" + size + ", "
				+ (color != null ? "color=" + color : "") + "]";
	}
}
