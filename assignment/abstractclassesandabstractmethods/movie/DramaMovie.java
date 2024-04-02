package assignment.abstractclassesandabstractmethods.movie;

public class DramaMovie extends Movie {
	
	public void stop() {
		System.out.println("\nDramaMovie stoped#");
	}

	@Override
	void play() {
		System.out.println("\nDramaMovie Playing..");
	}

}
