package assignment.stackqueueandlinkedlist.musicplayer;

class Song {
    String musicFileName;
    Song next;

    public Song(String musicFileName) {
        this.musicFileName = musicFileName;
        this.next = null;
    }
}
