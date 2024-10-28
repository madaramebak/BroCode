package library;

public class Book extends Items{
    private int ISBN;
	   private int pageCount;

    
    public Book(String name, String author, int identifaction){
		super(name, author, identifaction);
		this.ISBN = identifaction;
		this.pageCount = 0;
    }

	@Override
	public int getIdentification() {
		return this.ISBN;
	}

	@Override
	public void setIdentification(int ISBN) {
		this.ISBN = ISBN;
	}

	public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}