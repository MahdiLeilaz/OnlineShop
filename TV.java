
public class TV extends MultimediaItems {
	private String subCategory = "TV";
	protected enum brandTypes{SONY,LG,XVISION};
	protected enum resolutionTypes{ULTRAHD,FULLHD,HD};
	private String brand;
	private String resolution;
	private int size;
	protected TV(double price, int quantityInStock, String name) {
		super(price, quantityInStock, name);
		super.setSubCategory(this.subCategory);
	}
	protected String getBrand() {
		return brand;
	}
	protected void setBrand(brandTypes brand) {
		this.brand = brand.name();
	}
	protected String getResolution() {
		return resolution;
	}
	protected void setResolution(resolutionTypes resolution) {
		this.resolution = resolution.name();
	}
	protected int getSize() {
		return size;
	}
	protected void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "[" + (brand != null ? "brand=" + brand + ", " : "")
				+ (resolution != null ? "resolution=" + resolution + ", " : "") + "size=" + size + "]";
	}
}
