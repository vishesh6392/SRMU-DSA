package lec40;

public class searchInTwoD {

    public static boolean search(int[][] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at index: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {3, 5, 7},
            {1, 9, 2},
            {8, 4, 6}
        };

        int target = 9;

        if (!search(arr, target)) {
            System.out.println("Not Found");
        }
    }
}