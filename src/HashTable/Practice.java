



package HashTable;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;



public class Practice {


   static public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;

        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> hs1 = new HashSet<>();

        for(int i = 0 ; i < word1.length() ; i++){
            hs.add(word1.charAt(i));
            hs1.add(word2.charAt(i));
        }

        if(hs.size() != hs.size()){
            return false;
        }

        HashMap<Character , Integer > hm = new HashMap<>();
        HashMap<Character , Integer > hm1 = new HashMap<>();

        for(int i = 0 ; i < word1.length() ; i ++){

            if(hm.containsKey(word1.charAt(i))){

                int k = hm.get(word1.charAt(i));
                ++k;
                hm.put(word1.charAt(i) , k);
            }else{
                hm.put(word1.charAt(i) , 1);
            }

            if(hm1.containsKey(word2.charAt(i))){
                int k1 = hm1.get(word2.charAt(i));
                ++k1;
                hm1.put(word2.charAt(i) , k1);
            }else{
                hm1.put(word2.charAt(i) , 1);
            }
        }

        if(hm.equals(hm1)){
            return true;
        }else {
            return false;
        }

    }


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

//    5 Given a matrix of distinct values and a sum.
//    The task is to find all the pairs in a given matrix whose summation is equal to the given sum.
//    Each element of a pair must be from different rows i.e; the pair must not lie in the same row.
//    Examples:
//    Input : mat[4][4] = {{1, 3, 2, 4},
//        {5, 8, 7, 6},
//        {9, 10, 13, 11},
//        {12, 0, 14, 15}}
//    sum = 11
//    Output: (1, 10), (3, 8), (2, 9), (4, 7), (11, 0)

    public static String sortByFrequency(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue() - e1.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {

        System.out.println(closeStrings("cabbba", "abbccc"));
    }
}
