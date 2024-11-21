package grind.browsinghistory;

public class BrowserHistory {
    private History backHistory;
    private History forwardHistory;
    private String currentPage;

    public BrowserHistory(){
        backHistory = new History();
        forwardHistory = new History();
        currentPage = null;
    }

    public void visit(String url){
        if(currentPage != null){
            backHistory.push(currentPage);
        }
        currentPage = url;
    }

    public void back(){
        if(currentPage != null && !backHistory.isEmpty()){
            forwardHistory.push(currentPage);
            currentPage = backHistory.pop();
        }
    }

    public void forward(){
        if(currentPage != null && !forwardHistory.isEmpty()){
            backHistory.push(currentPage);
            currentPage = forwardHistory.pop();
        }
    }

    public String currentpage(){
        return currentPage;
    }
}
