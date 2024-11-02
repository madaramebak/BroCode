package grind.datastructures;

public class MyLinkedList {
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;

        return head;
    }

    public Node addAtCertain(int x, int data) {
        int counter = 0;
        Node temp = head;
        Node newNode = new Node(data);
        if (x == 1 || head == null) {
            return addFirst(data);
        }

        while (counter < x - 1) {
            if(temp == null){
                return head;
            }
            temp = temp.next;
            counter++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public Node addAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public boolean exist(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node delete(int data) {
        Node temp = head;

        if (head == null) {
            return null;
        }
        if (head.data == data) {
            return head.next;
        }
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;
    }
}

