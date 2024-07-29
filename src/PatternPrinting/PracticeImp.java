package PatternPrinting;

public class PracticeImp {
    public static void main(String[] args) {
        int numLines = 4;
        int start = 10;

        for (int i = 0; i < numLines; i++) {
            int currentNumber = start;

            for (int j = 0; j < numLines - i; j++) {
                System.out.print(currentNumber + " ");

                if (j < numLines - i - 1) {
                    currentNumber -= (numLines - i - j - 1); // Decrease based on the pattern
                }
            }

            System.out.println();

            start--;
        }
    }
}
