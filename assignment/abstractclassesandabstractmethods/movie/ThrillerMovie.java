package assignment.abstractclassesandabstractmethods.movie;

public class ThrillerMovie extends Movie{

	@Override
	void play() {
		System.out.println("\nThrillerMovie Playing..");
	}
	
	public void ban() {
		System.out.println("\nThrillerMovie was ban");
	}
	
}
