import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void print(int r, int c) {

        if (r == 0)
            return;

        if (c < r) {
            System.out.print("*");
            print(r, c + 1);
        } else {
            System.out.println();
            print(r - 1, 0);
        }

    }



   static void shift(int num) {

        int[] binary = new int[10];
        int index = 0;

        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }

        for (int i = 0; i < index ;i++){
//            System.out.print(binary[i]);
            if(binary[i] ==0){
                binary[i] = 1;
            }else{
                binary[i] = 0;
            }
        }

        int sum =0;
        for(int i = 0; i < index ; i++){
            sum += binary[i] * Math.pow(2, i) ;
        }

       System.out.println(sum);
    }

    public static void main(String[] args) {

        shift(17);

    }
}