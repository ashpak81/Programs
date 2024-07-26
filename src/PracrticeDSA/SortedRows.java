package PracrticeDSA;

import java.util.Scanner;

public class SortedRows {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            boolean increasing = true;
            boolean decreasing = true;

            for (int j = 1; j < n; j++) {
                if (arr[i][j] <= arr[i][j - 1]) {
                    increasing = false;
                }
                if (arr[i][j] >= arr[i][j - 1]) {
                    decreasing = false;
                }
            }

            if (increasing || decreasing) {
                ans++;
            }
        }

        System.out.println(ans);

    }
}
