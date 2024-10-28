package library;

public class Magazine extends Items{
    private int serialNumber;
    private int pageCount;
    private int yearIssue;


    public Magazine(String name, String author, int identification){
        super(name, author, identification);
        this.serialNumber = identification;
        this.pageCount = 0;
        this.yearIssue = 0;
    }

      public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYearIssue() {
        return this.yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }


     public int getIdentification() {
        return this.serialNumber;
    }

    public void setIdentifaction(int serialNumber) {
        this.serialNumber = serialNumber;
    }


}