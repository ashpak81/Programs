import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Practiceinjava {

     static BigInteger factorialHelper(BigInteger num) {
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return num.multiply(factorialHelper(num.subtract(BigInteger.ONE)));
    }

    static void commonElemnt(int[] arr1 ,int[] arr2 ,int[] arr3 ){

        HashMap<Integer,Integer> ans = new HashMap<>();

        for(int i = 0 ; i < arr1.length ; i++){
            int num1 = arr1[i];
            int num2 = arr2[i];
            int num3 = arr3[i];

            if(ans.containsKey(num1)){
                int c = ans.get(num1);
                ans.put(num2,++c);
            }else{
                ans.put(num1,1);
            }

            if(ans.containsKey(num2)){
                int c = ans.get(num2);
                ans.put(num2,++c);
            }else{
                ans.put(num2,1);
            }

            if(ans.containsKey(num3)){
                int c = ans.get(num3);
                ans.put(num3,++c);
            }else{
                ans.put(num3,1);
            }
        }


        for (Map.Entry<Integer,Integer> element : ans.entrySet()) {

            if(element.getValue() > 2){
                System.out.println(element.getKey());
            }

        }

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int count : charCount) {
            System.out.print(count);
        }


        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        System.out.println("--------------");

        for (int count : charCount) {
            System.out.print(count);
        }
        System.out.println();
        int a = 'z';
        System.out.println(a);
        System.out.println();
        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
        }
        System.out.println("-------------");

        for (int count : charCount) {
            System.out.print(count);
            if (count != 0) {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {

//        BigInteger bigNumber = new BigInteger("500");
//
//        BigInteger result = factorialHelper(bigNumber);
//
//
//        System.out.println(result);

//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,4,2};
//        int[] arr3 = {1,2,3,4,5};
//
//        commonElemnt(arr1,arr2,arr3);


        isAnagram("ashpak" ,"ashpak");
    }
}
