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


    public static void main(String[] args) {

//     fibonaciSeries(0,1,6);
//     System.out.println(0);
//     System.out.println(1);
//     System.out.println(factorial(7));

        
 }
}
