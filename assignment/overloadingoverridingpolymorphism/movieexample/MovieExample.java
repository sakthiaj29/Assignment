package assignment.overloadingoverridingpolymorphism.movieexample;

public class MovieExample {

	public static void main(String[] args) {
		
		Movie thrillerMovie=new ThrillerMovie("The Nun", "English", "R",150.0);
		thrillerMovie.display();
		
		Movie romComMovie=new RomComMovie("The Nun", "English", "R",120.0);
		romComMovie.display();
		
		Movie dramaMovie=new DramaMovie("Asuran", "Tamil", "U", 160.0);
		dramaMovie.display();
		
	}
}
