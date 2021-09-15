
public class Radio extends MultimediaItems {
	private String subCategory = "Radio";
	protected enum brandTypes{SAMSUNG,SONY};
	protected enum colorTypes{BLACK,RED,METALIC};
	protected enum functionTypes{AUTOMATIC,MANUAL};
	private String brand;
	private String color;
	private String function;
	protected Radio(double price, int quantityInStock, String name) {
		super(price, quantityInStock, name);
		super.setSubCategory(this.subCategory);
	}
	protected String getBrand() {
		return brand;
	}
	protected void setBrand(brandTypes brand) {
		this.brand = brand.name();
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(colorTypes color) {
		this.color = color.name();
	}
	protected String getFunction() {
		return function;
	}
	protected void setFunction(functionTypes function) {
		this.function = function.name();
	}
	@Override
	public String toString() {
		return "[" + (brand != null ? "brand=" + brand + ", " : "")
				+ (function != null ? "function=" + function + ", " : "") + (color != null ? "color=" + color : "")
				+ "]";
	}
}
