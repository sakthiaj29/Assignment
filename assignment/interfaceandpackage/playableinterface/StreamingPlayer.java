package assignment.interfaceandpackage.playableinterface;

public class StreamingPlayer implements Playable{

	public void play() {
		System.out.println("\tStreamingPlayer playing..");
	}
	
	public void pause() {
		System.out.println("\tStreamingPlayer pause!");
	}
	
	public void stop() {
		System.out.println("\tStreamingPlayer stoped#");
	}
	
}
