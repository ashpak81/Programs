package DSA.Recursion;


public class Practice {

    // Print 1 to 5 Numbers
    void printNumber(int num) {
        if (num == 6) {
            return;
        }
        System.out.print(" " + num);
        printNumber(num + 1);
    }

    // Print Sum Of First N Naturel Number

    void printSumOfNatural(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return ;
        }
        sum += i;
        printSumOfNatural(i + 1, n, sum);
    }

    // Factorial of a Number N

    int Factorial(int n){
        if(n ==1 ||  n == 0){
            return 1;
        }
    int fact = Factorial(n-1);

    int fact_n = n * fact;
    return fact_n;

    }

    public static void main(String[] args) {

        Practice obj = new Practice();
        System.out.println(obj.Factorial(5));
    }
}
