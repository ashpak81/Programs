package HashTable;
import java.util.HashMap;
import java.util.Map;

public class HashMapp {

    public static void main(String[] args) {

        // We can Access Null value in HashMap

        HashMap<Integer,String> hm = new HashMap<>();


        hm.put(10, "Ashpak");
        hm.put(11, "Sandeep");
        hm.put(12, "Rushikesh");
        hm.put(14, "Sourup");
        hm.put(7, "Vighnesh");
        hm.put(19, "Krishna");
//
//        hm.remove(12);
//        System.out.println(hm.containsKey(3));
//        System.out.println(hm.containsValue("Ashpak"));
//        System.out.println(hm.size());
//        System.out.println(hm);

        // Get Keys
        for(Integer tb : hm.keySet()){
            System.out.print(tb +" "+hm.get(tb) + " ");
        }

        System.out.println();

        // Get Values
        for(String tb : hm.values()){
            System.out.print(tb + " ");
        }

        System.out.println();

        // Get Both Key Values
        for(Map.Entry<Integer,String >pt :hm.entrySet()){
            System.out.print(pt.getKey() + " " + pt.getValue() + " ");
        }

    }

}
