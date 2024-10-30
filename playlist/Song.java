package grind.playlist;

public class Song extends Media {
    private final String GENRE;
    private final String FEATURES;

    public Song(String TITLE, String ARTISTNAME, int DURATION, String GENRE, String FEATURES){
        super(TITLE, ARTISTNAME, DURATION);
        this.GENRE = GENRE;
        this.FEATURES = FEATURES;
    }

    public String getFEATURES() {
        return FEATURES;
    }

    public String getGENRE() {
        return GENRE;
    }
}
