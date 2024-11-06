package grind.datastructures;

public class Queue {

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(){
            this.data = 0;
            this.next = null;
        }
    }
        private Node front;
        private Node rear;

        public Queue(){
            this.front = null;
            this.rear = null;
        }


        public boolean isEmpty(){
            return  front == null;
        }

        public void enqueue (int data){
            Node newNode = new Node(data);
            if (front == null) {
                front = newNode;
                rear = newNode;
            }else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public int dequeue(){
            int removedValue = 0;
            try {
                if (front == null) {
                    throw new EmptyQueueException("This Queue is already empty");
                } else if (front == rear){
                    removedValue = front.data;
                    front = null;
                    rear = null;
                }else {
                    removedValue = front.data;
                    front = front.next;
                }
            } catch (EmptyQueueException e) {
                System.out.println(e.getMessage());
            }
            return removedValue;
        }

        public int peek(){
            int value = 0;
            try {
                if (isEmpty()) {
                    throw new EmptyQueueException("Sorry empty queue.");
                }
                value = front.data;
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