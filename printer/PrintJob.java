package grind.printer;

public class PrintJob {
    private String fileName;
    private int pageCount;
    private JobStatus status;

    public PrintJob(String fileName, int pageCount){
        this.fileName = fileName;
        this.pageCount = pageCount;
        this.status = JobStatus.CREATED;
    }

    public PrintJob(){
        this.fileName = "blank.txt";
        this.pageCount = 0;
        this.status = JobStatus.CREATED;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public Boolean checkStatus(JobStatus checkStatus){
        return status == checkStatus;
    }
}