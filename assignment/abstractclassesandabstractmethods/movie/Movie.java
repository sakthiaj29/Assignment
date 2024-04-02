package assignment.abstractclassesandabstractmethods.movie;

abstract class Movie {
	
	abstract void play();
	
	public void stop() {
		System.out.println("\nMovie stoped#");
	}
	
	public void ban() {
		System.out.println("\nMovie was ban");
	}
	
}
