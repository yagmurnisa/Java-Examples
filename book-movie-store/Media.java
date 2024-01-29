public abstract class Media {

	private String name;
	private String type;
	private double price;
	private int year;
	private int amount;
	
	public Media() {
		super();
	}
	public Media(String name, String type, double price, int year, int amount) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.year = year;
		this.amount = amount;
	}
	public abstract void printMedia();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
