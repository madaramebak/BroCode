public class Book{
    private String name;
    private int ISBN;
    private String author;

    public Book(String name, int ISBN, String author){
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getISBN() {
		return this.ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

    

}