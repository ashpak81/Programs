package DSA.Algorithms;

import java.util.Scanner;

public class SearchingAndSorting {

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

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }


    // Selection Sort

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
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

        // Example usage:
        // System.out.println(search(arr, target));
        // System.out.println(binarySearch(target, arr));
        // bubbleSort(arr);
        // selectionSort(arr);

    }
}
