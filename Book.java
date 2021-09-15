
public class Book extends PrintedItems {
	private String subCategory = "Book";
	protected enum genres{FANTASY, HISTORICAL, CONTEMPORARY, MYSTERY, SCI_FI}
	private String author;
	private String genre;
	protected Book(double price, int quantityInStock, String name) {
		super(price, quantityInStock, name);
		super.setSubCategory(this.subCategory);
	}
	protected String getAuthor() {
		return author;
	}
	protected void setAuthor(String author) {
		this.author = author;
	}
	protected String getGenre() {
		return genre;
	}
	protected void setGenre(genres genre) {
		this.genre = genre.name();
	}
	@Override
	public String toString() {
		return "[" + (author != null ? "author=" + author + ", " : "")
				+ (genre != null ? "genre=" + genre : "")
				+ super.toString();
	}
}
