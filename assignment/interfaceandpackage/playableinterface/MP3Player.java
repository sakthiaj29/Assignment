package assignment.interfaceandpackage.playableinterface;

public class MP3Player implements Playable{

	public void play() {
		System.out.println("\tMP3Player playing..");
	}
	
	public void pause() {
		System.out.println("\tMP3Player pause!");
	}
	
	public void stop() {
		System.out.println("\tMP3Player stoped#");
	}
	
}
