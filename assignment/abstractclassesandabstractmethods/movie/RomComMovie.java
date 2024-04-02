package assignment.abstractclassesandabstractmethods.movie;

public class RomComMovie extends Movie{
	
	public void display() {
		System.out.println("\\nRomComMovie display..");
	}

	@Override
	void play() {
		System.out.println("\nRomComMovie Playing..");
	}
	
}
