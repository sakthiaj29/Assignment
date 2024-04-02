package assignment.abstractclassesandabstractmethods.movie;

public class MovieExample {

	public static void main(String[] args) {
		
		Movie thrillerMovie=new ThrillerMovie();
		thrillerMovie.play();
		thrillerMovie.ban();
		
		Movie romComMovie=new RomComMovie();
		romComMovie.play();
		romComMovie.stop();
		
		Movie dramaMovie=new DramaMovie();
		dramaMovie.play();
		dramaMovie.stop();
		
	}
}
