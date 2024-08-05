package HashTable;
import java.util.HashSet;

public class hashSetp {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(11);
        hs.add(12);
        hs.add(13);
        hs.add(14);

        hs.remove(10);

        System.out.println(hs.contains(10));
        System.out.println(hs);

        for(Integer st1: hs){
            System.out.print(st1+" ");
        }
    }
}
