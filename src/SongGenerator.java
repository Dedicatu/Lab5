import java.util.Random;
public class SongGenerator {
    public static void main(String[] args) {
        String[] titles = {"Blinding Lights", "Happier", "Watermelon Sugar", "Bad Guy", "Levitating", "Mood", "Stay", "Dynamite", "Hello", "Rolling in the Deep", "Uptown Funk", "Thinking Out Loud", "Royals", "Can't Hold Us", "Take Me to Church", "Radioactive", "Someone Like You", "Let Her Go", "All of Me", "Shallow", "Wrecking Ball", "Shape of You", "Despacito", "Stay with Me", "Vigilante"};
        String[] albums = {"After Hours", "Marshmello: Fortnite Extended Set", "Fine Line", "When We All Fall Asleep, Where Do We Go?", "Future Nostalgia", "Life of a Dark Rose", "Happier Than Ever", "Dynamite", "25", "21", "Uptown Special", "x", "Pure Heroine", "The Heist", "Hozier", "Night Visions", "21", "All the Little Lights", "Love in the Future", "A Star Is Born", "Bangerz", "÷ (Divide)", "Vida", "In the Lonely Hour", "R∃/MEMBER"};
        int[] durations = {200, 217, 174, 194, 203, 140, 202, 199, 295, 228, 270, 281, 190, 258, 242, 188, 287, 249, 270, 217, 223, 234, 229, 172, 291};

        Song[] songs = new Song[titles.length];
        Random rand = new Random();

        for (int i = 0; i < songs.length; i++) {
            int songId = rand.nextInt(8999999) + 1000000;
            songs[i] = new Song(titles[i], albums[i], durations[i], songId);
            System.out.println(songs[i].toString());
        }
    }
}
