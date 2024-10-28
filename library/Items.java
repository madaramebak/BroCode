package library;

public class Items{
    private String name;
    private String author;
    private int identification;
    private Boolean reserved;


    public Items(String name, String author, int identification){
        this.name = name;
        this.author = author;
        this.identification = identification;
        this.reserved = false;
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

     public int getIdentification() {
        return this.identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    	public Boolean getReserved() {
		return this.reserved;
	}

	public void setReserved(Boolean reserved) {
		this.reserved = reserved;
	}


    public boolean reserved(boolean decision){
        return decision;
    }
}