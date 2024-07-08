import java.util.Scanner;

public class Loop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

//        for(int i =1 ;i<11;i++){ // for(initialization; condition ; increment/decrement)
//            System.out.println(i+" Ashpak Patel"); // for loop is used to run a block of code multiple time until condition get false
//        }


 /*   // Program for to Print table
        System.out.println("Enter number :- ");
        int num = sc.nextInt();
        for(int i = 1;i <=10;i++) {
            System.out.println(num + "*" + i + "=" + (i * num));
        }
  */
   /*
        // Program to write even number between 200 to 500
        for(int i = 200;i <=500;i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }

    */
//
//        int num = sc.nextInt();
//        int i = 0;
//        while (i<=10){
//            System.out.println(num + "*" + i + "=" + (i * num));
//            i++;
//        }

//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 5; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
