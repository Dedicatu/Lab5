import java.util.Random;
class Song {
    String title;
    String album;
    int duration;
    int songId;

    public Song(String title, String album, int duration, int songId) {
        this.title = title;
        this.album = album;
        this.duration = duration;
        this.songId = songId;
    }

    public String toString() {
        return "Song ID: " + songId + ", Title: " + title + ", Album: " + album + ", Duration: " + duration;
    }

}


