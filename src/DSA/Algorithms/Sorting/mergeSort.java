package DSA.Algorithms.Sorting;

import java.util.Arrays;

public class mergeSort {

    static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 5, 4, 6};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
