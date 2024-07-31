import java.util.ArrayList;

public class Player {
    private ArrayList<Music> liste;

    public Player() {
        liste = new ArrayList<Music>();
    }

    public void addList(Music m) {
        liste.add(m);
    }

    public void Play() {
        for (Music m : liste) {
            m.MP3Play();
        }
    }
}
