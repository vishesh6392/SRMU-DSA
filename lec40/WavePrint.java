package lec40;

public class WavePrint {

    public static void wavePrint(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int col = 0; col < m; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        wavePrint(arr);
    }
}
