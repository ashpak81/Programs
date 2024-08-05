package recursion;

public class practice {

    // FibonaciSeries

 static void fibonaciSeries(int a , int b,int n){

     if(n == 0){
         return;
     }

     int c =  a+b;
     a = b;
     b = c;

     System.out.println(c);
     fibonaciSeries(a,b,--n);

 }

    // factorial of num

    static int factorial(int n){

        if(n == 0){
        return 1;
        }
        return n * factorial(n-1);
    }


//    4. Write a Java recursive method to check if a given string is a palindrome.

   static boolean stringPalindrome(String str){

     if(str.length() <= 1){
         return true;
     }

     char firstChar = str.charAt(0);
     char secondChar = str.charAt(str.length() -1);

     if(firstChar != secondChar){
         return false;
     }

     boolean ans = stringPalindrome(str.substring(1, str.length()-1));

     return ans;
    }


    // 5. Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).

    static int baseToPower(int  base , int  power){

     if(power == 0)
         return 1;

     int ans = base * baseToPower(base , --power);

    return ans;
    }

    // 6. Write a Java recursive method to reverse a given string.

    static String reverse(String str){

        if(str.equals(""))
            return "";

        return reverse(str.substring(1)) + str.charAt(0);
 }

    public static void main(String[] args) {

//     fibonaciSeries(0,1,6);
//     System.out.println(0);
//     System.out.println(1);//     System.out.println(factorial(7));

        System.out.println(stringPalindrome("nitiN"));
        System.out.println(baseToPower(2,3));
        System.out.println(reverse("Ashpak"));

 }
}
