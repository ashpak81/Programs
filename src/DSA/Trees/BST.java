package DSA.Trees;

import java.util.Stack;


public class BST {

    static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    static Node root;


    // With Recursion

    void insert(int data) {
        root = InsertData(root, data);
    }

    Node InsertData(Node root, int data) {


        if (root == null ) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = InsertData(root.left, data);
        } else {
            root.right = InsertData(root.right, data);
        }

        return root;
    }


    Node printdata(Node root){

        if(root ==null)
            return root;

        printdata(root.left);
        System.out.print(root.data + " ");
        printdata(root.right);

        return root;
    }

    void lwt(int p , int q ){
        Node a = lowestCommonAncestor(root,p,q);
        System.out.println(a.data);
    }



    public Node lowestCommonAncestor(Node root, int p, int q) {
        if (root == null || root.data == p || root.data == q){
            return root;
        }

        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);

        if(left!= null && right != null){
            return root;
        }
        else if(left != null) {
            return left;
        }
        else{
            return right;
        }
//        return root;
    }



    // Without Recursions
//  static   void insertData(int data) {
//        Node newElemnt = new Node(data);
//
//        if (root == null) {
//            root = newElemnt;
//            return;
//        }
//
//        Stack<Node> st = new Stack<>();
//        st.add(root);
//
//        while (!st.isEmpty()) {
//
//            Node temp = st.pop();
//
//            if (temp.data > data) {
//                if (temp.left != null) {
//                    st.add(temp.left);
//                } else {
//                    temp.left = newElemnt;
//                }
//            } else {
//                if (temp.right != null) {
//                    st.add(temp.right);
//                } else {
//                    temp.right = newElemnt;
//                }
//            }
//        }
//
//    }
//

    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(25);
        tree.insert(12);
        tree.insert(5);
        tree.insert(4);
        tree.insert(8);
        tree.insert(32);
        tree.insert(30);
        tree.insert(35);
        tree.insert(18);
        tree.insert(15);
        tree.insert(20);
        tree.insert(31);
        tree.insert(28);
        tree.insert(26);
        tree.insert(29);

        tree.printdata(root);
        System.out.println();
        tree.lwt(28,35);

    }
}
