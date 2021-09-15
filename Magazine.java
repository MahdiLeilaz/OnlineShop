
public class Magazine extends PrintedItems {
	private String subCategory = "Magazine";
	protected enum subjects{SCIENCE,TECHNOLOGY,WOMEN,NEWS,ECONOMIC,COMEDY};
	private String subject;
	private int number;
	protected Magazine(double price, int quantityInStock, String name) {
		super(price, quantityInStock, name);
		super.setSubCategory(this.subCategory);
	}
	protected String getSubject() {
		return subject;
	}
	protected void setSubject(subjects subject) {
		this.subject = subject.name();
	}
	protected int getNumber() {
		return number;
	}
	protected void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "[" + (subject != null ? "subject=" + subject + ", " : "") + "number=" + number + super.toString();
	}
}
