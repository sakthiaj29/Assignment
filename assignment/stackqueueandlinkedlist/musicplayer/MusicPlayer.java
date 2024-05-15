package assignment.stackqueueandlinkedlist.musicplayer;

public class MusicPlayer {

	public void start() {
		System.out.println("<--------->🎷🎷 Welcome to SAKTHI 🎵-Music Player-🎵 Playlist 🔊🔊<--------->");
		new OptionSongs().init();
	}
	
	public static void main(String[] args) {
		MusicPlayer musicPlayer=new MusicPlayer();
		musicPlayer.start();
	}

}
