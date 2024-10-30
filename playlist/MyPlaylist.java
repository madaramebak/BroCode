package grind.playlist;
import java.util.*;


public class MyPlaylist {
    private String name;
    private int mediaCount;
    private ArrayList<Media> playlist;

    public MyPlaylist(String name){
        this.name = name;
        this.playlist = new ArrayList<Media>();
        this.mediaCount = 0;
    }

    public ArrayList<Media> getPlaylist() {
        return playlist;
    }

    public void addMedia(Media media) {
        playlist.add(media);
        mediaCount++;
    }

    public void removeMedia(Media media) {
        playlist.remove(media);
        mediaCount--;
    }

    public void shufflePlaylist() {
        Collections.shuffle(playlist);
    }
}
