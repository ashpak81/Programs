import java.util.Scanner;

public class Patter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for(int a = 2; a <= i; a++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        for (int i = 1; i <= 5; i++) {
            for(int a = 2; a <= i; a++) {
                System.out.print("*");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            System.out.println(" ");
        }
    }
}
