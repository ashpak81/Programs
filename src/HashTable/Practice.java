package HashTable;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Practice {



    void getMaxCount() {
        int arr[] = {1, 3, 2, 1, 4, 4, 4, 4, 4, 1};
        int n = arr.length;
        Hashtable<Integer, Integer> mp = new Hashtable<>();

        for (int i = 0; i < n; i++) {

            if (mp.containsKey(arr[i])) {
                int fre = mp.get(arr[i]);
                fre++;
                mp.put(arr[i], fre);
            } else {
                mp.put(arr[i], 1);
            }
        }

        int max = 0;

        for (Integer pt : mp.values()) {
            if (pt > max) {
                max = pt;
            }
        }

        System.out.println(mp.get(max));

    }

    void addPair() {
        int[] arr = {0, 10, 11, 6, 4, 5, 3, 2};

        HashSet<Integer> hm = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int res = 10 - arr[i];

            if (hm.contains(res)) {
                System.out.println(res + " " + arr[i]);
            }
            hm.add(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 4, 0, 3, 3};

        int[] arr2 = {2, 3, 5, 0, 1, 1, 1};

        HashMap<Integer, Integer> hs = new HashMap<>();
        HashMap<Integer, Integer> hs1 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {


        }


    }
}
