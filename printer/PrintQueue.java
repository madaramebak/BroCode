package grind.printer;

public class PrintQueue {

    public class Node {
        private PrintJob data;
        private Node next;

        public Node(PrintJob data) {
            this.data = data;
            this.next = null;
        }

        public Node(){
            this.data = null;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;

    public PrintQueue(){
        this.front = null;
        this.rear = null;
    }


    public boolean isEmpty(){
        return  front == null;
    }

    public void enqueue (PrintJob job){
        job.setStatus(JobStatus.QUEUED);
        Node newNode = new Node(job);
        if (front == null) {
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public PrintJob dequeue(){
        PrintJob removedValue = null;
        try {
            if (front == null) {
                throw new EmptyQueueException("This Queue is already empty");
            } else if (front == rear){
                removedValue = front.data;
                front = null;
                rear = null;
                removedValue.setStatus(JobStatus.PRINTING);
            }else {
                removedValue = front.data;
                front = front.next;
                removedValue.setStatus(JobStatus.PRINTING);
            }
        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
        return removedValue;
    }

    public PrintJob peek(){
        PrintJob value = null;
        try {
            if (isEmpty()) {
                throw new EmptyQueueException("Sorry empty queue.");
            }
            value = front.data;
            value.setStatus(JobStatus.READY);
        }catch(EmptyQueueException e){
            System.out.println(e.getMessage());
        }
        return value;
    }

    public class EmptyQueueException extends Exception{
        public EmptyQueueException(String message){
            super(message);
        }
    }
}