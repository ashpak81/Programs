package DSA.Recursion;

public class printXn {

    // Print x ^ n

   static void power(int x , int n , int i){
        if(n == i){
            System.out.println(x * x);
            return;
        }
   }


    public static void main(String[] args) {
       printXn.power(5,5,0);
    }
}
