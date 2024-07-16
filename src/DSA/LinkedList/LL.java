package DSA.LinkedList;

class Node {

    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LL {

    int size = 0;

    // HEAD Starting Point

    Node head;

    LL() {
        head = null;
    }

    // Element At the End

    void AddLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Element at First

    void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print List element
    void printList() {
        Node last = head;
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.next;
        }
    }

    // Size of LinkedList

    int size() {
        return size;
    }

    //Reversed  LinkedList

    void reversLinkedList() {

        if (head == null || head.next == null)
            return;

        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            // update

            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    // LinkedList is Palindrome or not

    void palindrome() {

        if (head == null || head.next == null) {
            System.out.println("String Is Palindrome");
            return;
        }

        Node last = head;
        int count = 0;
        int linkedListSize = size;
        boolean ans = true;
        String[] check = new String[linkedListSize];

        while (last != null) {
            check[count] = last.data;
            last = last.next;
            count++;
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i].equals(check[linkedListSize - 1])) {
                ans = true;
            } else {
                ans = false;
                break;
            }
            linkedListSize--;
        }

        if (ans)
            System.out.println("LinkedList is Palindrome");
        else
            System.out.println("LinkedList Not is Palindrome");
    }

    // Sum of Linked list element

    void sum(){

        StringBuilder sc = new StringBuilder();

        Node last = head;

        while (last != null) {
            sc.append(last.data);
            last = last.next;
        }
        System.out.println(sc);
    }


    public static void main(String[] args) {

        LL list = new LL();
        
             
        list.AddLast("A");
        list.AddLast("A");
        list.AddLast("B");
        list.AddLast("A");
        list.AddLast("A");
        
        list.printList();
        System.out.println("Size of LinkedList " + list.size());

        list.reversLinkedList();
        list.printList();
        list.palindrome();
        list.sum();
    }
}