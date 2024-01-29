public class Book extends Media {

	private String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String type, String author, double price, int year, int amount) {
		super(name, type, price, year, amount);
		this.author= author;
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void printMedia() {
		System.out.println("Book: "+getName()+" "+"Author: "+getAuthor()+" "+"Price: "+getPrice()+" "+"Year: "+getYear()+" "+"Stock: "+getAmount());
	}	

}
