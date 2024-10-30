package grind.playlist;

public class Media implements MediaData {
    private final String TITLE;
    private final String ARTISTNAME;
    private final int DURATION;

    public Media(String TITLE, String ARTISTNAME, int DURATION){
        this.TITLE = TITLE;
        this.ARTISTNAME = ARTISTNAME;
        this.DURATION = DURATION;
    }
    public String getTitle(){
        return TITLE;
    }
    public String getArtistName(){
        return ARTISTNAME;
    }

    public int getDuration(){
        return DURATION;
    }



}