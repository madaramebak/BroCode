package grind.browsinghistory;

import grind.printer.PrintQueue;

public class History {
    private Node top;

    public class Node {
        private String data;
        private Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public History() {
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }

    public String pop(){
        String site = " ";
    try {
        if (top == null) {
            throw new EmptyStackException("Your browsing history is currently empty");
        } else {
            site = top.data;
            top = top.next;
        }
    }catch(EmptyStackException e){
        System.out.println(e.getMessage());
    }
        return site;
    }

    public String peek(){
        String site = " ";
    try {
        if (top == null) {
            throw new EmptyStackException("Your browsing history is currently empty");
        } else {
            site = top.data;
        }
    }catch(EmptyStackException e){
            System.out.println(e.getMessage());
        }
        return site;
    }
    public class EmptyStackException extends Exception{
        public EmptyStackException(String message){
            super(message);
        }
    }
}