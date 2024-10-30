package grind.playlist;

public class Podcast extends Media{
    private final String GUEST;

    public Podcast(String TITLE, String ARTISTNAME, int DURATION, String GUEST){
        super(TITLE, ARTISTNAME, DURATION);
        this.GUEST = GUEST;
    }

    public String getGUEST() {
        return GUEST;
    }
}