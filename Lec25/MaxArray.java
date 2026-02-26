package Lec25;

public class MaxArray {

    public static int maxArray(int[] arr) {
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {-19, 19, -20, 5, 20, 6};

        int ans = maxArray(arr);

        System.out.println("Maximum element is: " + ans);
    }
}