
public class MultimediaItems extends SalesItem {
	private final Categories category = Categories.MULTIMEDIA;
	protected MultimediaItems(double price, int quantityInStock, String name) {
		super(price, quantityInStock, name);
	}
	protected Categories getCategory() {
		return category;
	}
}
