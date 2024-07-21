package DSA.Stack;

public class StackUsingLinkedList {

        static class Node{
            int data;
            Node next;
             Node(int data){
                this.data = data;
                next = null;
            }
        }

        static class  Stack{

             static Node head;

             static boolean isEmplty(){
                 if(head == null){
                     return true;
                 }
                 return false;
             }

             static void Push(int data){

                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;

            }

            static int pop(){

                 if(head == null){
                   return -1;
                 }

                 int top = head.data;
                 head = head.next;
                 return top;
            }

            static int peek(){
                 if(head == null){
                     return -1;
                 }
                 return head.data;
            }


            static void list(){
                 if(head == null){
                     System.out.println("Stack is Empty");
                     return;
                 }

                 Node currNode = head;

                 while (currNode != null){
                     System.out.print(currNode.data +" -> ");
                     currNode = currNode.next;
                 }
            }


        }
    public static void main(String[] args) {


        Stack sc = new Stack();

        // Push Elements
        sc.Push(1);
        sc.Push(2);
        sc.Push(3);
        sc.Push(4);
        sc.Push(5);

        sc.list();
        System.out.println();

        // POP Element
        System.out.println(sc.pop());
        sc.list();

        // PEEK Element
        System.out.println();
        System.out.println(sc.peek());

        sc.list();





    }
}
