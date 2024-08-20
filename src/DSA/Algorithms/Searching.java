package DSA.Algorithms;

import java.util.Scanner;

public class Searching {

    static boolean search(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Binary Searching

    static int binarySearch(int target, int[] arr) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the found element
            } else if (arr[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1; // Element not found
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of elements in array:");

        int elementCount = sc.nextInt();
        int[] arr = new int[elementCount];

        System.out.println("Enter elements in array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to find:");
        int target = sc.nextInt();

        binarySearch(target,arr);
    }
}
