package lec39;

import java.util.*;

class intersection {
    public static ArrayList<Integer> intersection(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {

            if (a[i] < b[j]) {
                i++;
            } 
            else if (a[i] > b[j]) {
                j++;
            } 
            else {
                // Equal elements
                if (ans.isEmpty() || a[i] != ans.get(ans.size() - 1)) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 4};
        int b[] = {2, 2, 3, 5};

        ArrayList<Integer> result = intersection(a, b);
        System.out.println(result);
    }
}
