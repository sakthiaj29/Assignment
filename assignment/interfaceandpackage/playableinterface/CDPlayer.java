package assignment.interfaceandpackage.playableinterface;

public class CDPlayer implements Playable{

	public void play() {
		System.out.println("\tCDPlayer playing..");
	}
	
	public void pause() {
		System.out.println("\tCDPlayer pause!");
	}
	
	public void stop() {
		System.out.println("\tCDPlayer stoped#");
	}
	
}
