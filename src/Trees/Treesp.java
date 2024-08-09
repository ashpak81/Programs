package Trees;

import java.nio.file.FileAlreadyExistsException;
import java.util.LinkedList;
import java.util.Queue;

public class Treesp {

    static class Node {
        int data;
        Node rigth, left;

        Node(int data) {
            this.data = data;
            rigth = null;
            left = null;
        }
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.rigth);
    }

    static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.rigth);
        System.out.print(root.data + " ");
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        System.out.print(root.data + " ");
        postOrder(root.rigth);
    }

    static void BFS(Node root) {

        Queue<Node> element = new LinkedList<>();
        element.add(root);
        int sum = 0;
        while (!element.isEmpty()) {

            Node temp = element.poll();
            System.out.print(temp.data);

            sum += temp.data;
            if (temp.left != null)
                element.add(temp.left);

            if (temp.rigth != null)
                element.add(temp.rigth);
        }

        System.out.println();
        System.out.println(sum);
    }

    // Tree Sum Using recursion

    static int treeSum(Node root) {
        if (root == null)
            return 0;

        return root.data + treeSum(root.left) + treeSum(root.rigth);

    }

    // Find element Using Recursion

    static boolean found(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        System.out.println(root.data);

        return found(root.left, key) || found(root.rigth, key);
    }


    static boolean Identicalfound(Node root1, Node root2) {


        if (root1 == null && root2 == null)
            return false;

        if (root2.data != root1.data)
            return false;

        if (root2 == null || root1 == null)
            return false;

        boolean ans = Identicalfound(root1.left, root2.left) && Identicalfound(root2.rigth, root2.rigth);

        return ans;
    }

    static void highestLevel(Node root) {


    }


    static void InsertElement(Node root, int Key) {

        Queue<Node> element = new LinkedList<>();
        element.add(root);

        while (!element.isEmpty()) {

            Node temp = element.poll();

            if (temp.left != null) {
                element.add(temp.left);
            } else {
                temp.left = new Node(Key);
                break;
            }
            if (temp.rigth != null) {
                element.add(temp.rigth);
            } else {
                temp.rigth = new Node(Key);
                break;
            }
        }

    }


    static boolean SumTree(Node root) {
        if (root == null)
            return false;

        int sum = root.rigth.data + root.left.data;

        SumTree(root);

        int nSum = sum - root.data;

        if (nSum == root.data) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        return false;
    }


    public static void main(String[] args) {

        Node root = new Node(26);
        root.left = new Node(10);
        root.rigth = new Node(3);
        root.left.left = new Node(4);
        root.left.rigth = new Node(6);
        root.rigth.rigth = new Node(3);


//        BFS(root);
//        System.out.println();
//
//        preOrder(root);
//        System.out.println();
//        inOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println(treeSum(root));
//        System.out.println();
//        BFS(root);
//        System.out.println();
//        System.out.println(found(root, 33));
//        InsertElement(root,9);
//        BFS(root);

//        System.out.println(Identicalfound(root,root2));
    }
}
