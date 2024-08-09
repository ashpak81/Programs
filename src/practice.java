import java.util.Scanner;
import java.util.Stack;


class Node {

    int data;
    Node Next;

    Node(int data) {
        this.data = data;
        Next = null;
    }


    public static class practice {

        Node head;

        void addElement(int data) {
            Node addNode = new Node(data);
            if (head == null) {
                head = addNode;
                return;
            }

            Node newNode = head;

            while (newNode.Next != null) {
                newNode = newNode.Next;
            }
            newNode.Next = addNode;

        }

        void reverse(int k) {

            Node  preNode = head;

            while (k>1){
                preNode = preNode.Next;
                k--;
            }

            Node currNode = preNode;

            Stack<Integer> tp = new Stack<>();

            while (currNode.Next != null){
                tp.add(currNode.Next.data);
                currNode.Next = currNode.Next.Next;
            }

            preNode.Next = null;

            while(!tp.isEmpty()){
                addElement(tp.pop());
            }

        }

        void print() {
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.Next;
            }

        }
    }

    public static void main(String[] args) {

        practice obj = new practice();

        obj.addElement(1);
        obj.addElement(5);
        obj.addElement(9);
        obj.addElement(13);
        obj.addElement(16);
        obj.addElement(12);

        obj.print();

        int k = 3;

        System.out.println();

        obj.reverse(k);

        obj.print();
    }
}
