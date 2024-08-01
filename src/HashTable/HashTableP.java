package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableP {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(10, "Ashpak");
        ht.put(11, "Sandeep");
        ht.put(12, "Rushikesh");
        ht.put(14, "Sourup");
        ht.put(7, "Vighnesh");
        ht.put(19, "Krishna");
//
//        ht.remove(12);
//        System.out.println(ht.containsKey(3));
//        System.out.println(ht.containsValue("Ashpak"));
//        System.out.println(ht.size());
//        System.out.println(ht);

        // Get Keys
        for(Integer tb : ht.keySet()){
            System.out.print(tb +" "+ht.get(tb) + " ");
        }

        System.out.println();

        // Get Values
        for(String tb : ht.values()){
            System.out.print(tb + " ");
        }

        System.out.println();

        // Get Both Key Values
        for(Map.Entry<Integer,String >pt :ht.entrySet()){
            System.out.print(pt.getKey() + " " + pt.getValue() + " ");
        }

    }
}
