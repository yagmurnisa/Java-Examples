import java.util.Arrays;

public class Movie extends Media {

	private String[] actors;
	private String director;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String name, String type, String director, String[] actors, double price, int year, int amount) {
		super(name, type, price, year, amount);
		this.director=director;
		this.actors= actors;
		// TODO Auto-generated constructor stub
	}

	public String[] getActors() {
		return actors;
	}

	public void setAuthor(String[] actors) {
		this.actors = actors;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public void printMedia() {
		System.out.println("Movie: "+getName()+" "+"Director: "+director+" "+"Actors: "+Arrays.toString(actors)+" "+"Price: "+getPrice()+" "+"Year: "+getYear()+" "+"Stock: "+getAmount());
	}
}
