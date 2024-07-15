package DSA.LinkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL {

    // HEAD Starting Point
    Node head;

    LL() {
        head = null;
    }

    // Element At the End

    void AddLast(int data){
    Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null){
            last = last.next;
        }

        last.next = newNode;

    }

    // Print List element
    void printList(){
        Node last = head;
        while (last != null){
            System.out.print(last.data+ " -> ");
            last = last.next;
        }

    }

    public static void main(String[] args) {

        LL list = new LL();
        list.AddLast(5);
        list.AddLast(12);
        list.AddLast(23);
        list.printList();

    }
}
