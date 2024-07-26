package PatternPrinting;

public class PracticeImp {
    public static void main(String[] args) {
        int start = 10;
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (rows - i); j++) {
                System.out.print(start);
                if (j < (rows - i - 1)) {
                    System.out.print(" ");
                }
                start--;
            }
            System.out.println();
        }
    }
}
