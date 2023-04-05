import java.util.LinkedList;
public class Songlist<T1,T2,T3,T4> {

    private T1 songData1;
    private T2 songData2;
    private T3 songData3;
    private T4 songData4;

    public Songlist(T1 songData1, T2 songData2, T3 songData3, T4 songData4) {
        this.songData1 = songData1;
        this.songData2 = songData2;
        this.songData3 = songData3;
        this.songData4 = songData4;
    }

    public T1 getSongData1() {
        return songData1;
    }

    public void setSongData1(T1 songData1) {
        this.songData1 = songData1;
    }

    public T2 getSongData2() {
        return songData2;
    }

    public void setSongData2(T2 songData2) {
        this.songData2 = songData2;
    }

    public T3 getSongData3() {
        return songData3;
    }

    public void setSongData3(T3 songData3) {
        this.songData3 = songData3;
    }

    public T4 getSongData4() {
        return songData4;
    }

    public void setSongData4(T4 songData4) {
        this.songData4 = songData4;
    }

    public String toString() {
        return "Song data 1: " + songData1 + ", Song data 2: " + songData2 + ", Song data 3: " + songData3 + ", Song data 4: " + songData4;
    }
    public static <T1, T2, T3> void displayAllSongs(LinkedList<Songlist<T1, T2, T3, ?>> songs) {
        for (Songlist<T1, T2, T3, ?> song : songs) {
            System.out.println(song.getSongData1() + ", " + song.getSongData2() + ", " + song.getSongData3());
        }
    }
}
