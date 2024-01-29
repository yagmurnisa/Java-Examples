public class Main {

	public static void main(String[] args) {

		Media[] mediaList = {new Book("Insan ne ile yaşar", "Book", "Lev Tolstoy", 24.99, 1844, 10), 
		new Movie("Interstellar", "Movie", "Christopher Nolan", new String[]{"Matthew Mccougney","Anne Hathaway", "Jessica Chastain"}, 40.5, 2014, 2),
		new Book("Suç ve Ceza", "Book", "Dostoyevski", 74.5, 1886, 8), 
		new Movie("The Godfather", "Movie", "Francis Ford Coppola", new String[]{"Marlon Brando", "Robert De Niro", "Al Pacino"}, 100, 1969, 3),
		new Book("Iki Şehrin Hikayesi", "Book", "Charles Dickens", 85, 1859, 5)};
	
		BinarySearchTree bst = new BinarySearchTree();
		
		for(Media item: mediaList) {
			bst.add(item);
		}
		bst.printElements();
	}
}
