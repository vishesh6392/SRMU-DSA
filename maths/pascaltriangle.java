package maths;

import java.util.Scanner;

public class pascaltriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= row; col++) {
                int ans = 1;
                for (int i = 0; i < col; i++) {
                    ans = (ans * (row - i)) / (i + 1);
                }
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}
