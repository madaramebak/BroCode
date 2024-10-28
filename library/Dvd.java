package library;

public class Dvd extends Items{
private int sid;
    private int duration;

public Dvd(String name, String author, int identification){
        super(name, author, identification);
        this.sid = identification;
        this.duration = 0;
    }

    @Override
	public int getIdentification() {
		return this.sid;
	}

    @Override
	public void setIdentification(int sid) {
		this.sid = sid;
	}

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}