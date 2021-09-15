
public class ObjectBuilder {

	private static int count = 0;

	private static Radio radio1 = new Radio(120000.0, 15, "Ec150");
	private static Radio radio2 = new Radio(560000.0, 4, "AutoR2000");
	private static TV tv1 = new TV(2435000.0, 6, "A46S+");
	private static TV tv2 = new TV(4305000.0, 3, "SX_series50a");
	private static TV tv3 = new TV(4005000.0, 3, "L100");
	private static Book book1 = new Book(84000.0, 22, "Harry Potter");
	private static Book book2 = new Book(1000000.0, 3, "Kelider");
	private static Magazine magazine1 = new Magazine(18000.0, 9, "Gol Agha");
	private static Shoe shoe1 = new Shoe(459000.0, 9, "Nike101");

	private int length = SalesItem.getCount();
	private SalesItem[] itemsList = new SalesItem[length];

	protected void start() {
		radio1.setBrand(Radio.brandTypes.SAMSUNG);// QUASTION? Why radio1.brandT... dont work; what is public enum in
													// that class?
		radio1.setFunction(Radio.functionTypes.MANUAL);
		radio1.setColor(Radio.colorTypes.RED);
		itemsList[count++] = radio1;

		radio2.setBrand(Radio.brandTypes.SONY);
		radio2.setFunction(Radio.functionTypes.AUTOMATIC);
		radio2.setColor(Radio.colorTypes.BLACK);
		itemsList[count++] = radio2;

		tv1.setBrand(TV.brandTypes.XVISION);
		tv1.setSize(46);
		tv1.setResolution(TV.resolutionTypes.HD);
		itemsList[count++] = tv1;

		tv2.setBrand(TV.brandTypes.SONY);
		tv2.setSize(50);
		tv2.setResolution(TV.resolutionTypes.FULLHD);
		itemsList[count++] = tv2;

		tv3.setBrand(TV.brandTypes.LG);
		tv3.setSize(50);
		tv3.setResolution(TV.resolutionTypes.ULTRAHD);
		itemsList[count++] = tv3;

		book1.setAuthor("J.K.Rowling");
		book1.setGenre(Book.genres.FANTASY);
		book1.setNumberOfPages(340);
		itemsList[count++] = book1;

		book2.setAuthor("M.Dowlatabadi");
		book2.setGenre(Book.genres.CONTEMPORARY);
		book2.setNumberOfPages(3000);
		itemsList[count++] = book2;

		magazine1.setSubject(Magazine.subjects.COMEDY);// what is wrong with enum ?? why we must write class before it!
		magazine1.setNumber(101);
		magazine1.setNumberOfPages(45);
		itemsList[count++] = magazine1;

		shoe1.setShoeType(Shoe.shoeTypes.sport);
		shoe1.setColor(Shoe.colorTypes.multicolor);
		shoe1.setSize(45);
		itemsList[count++] = shoe1;
	}

	public SalesItem[] getItemsList() {
		return itemsList;
	}
}
