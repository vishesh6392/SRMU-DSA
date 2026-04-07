package lec39;
import java.util.*;

class union{
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {

            if (a[i] < b[j]) {
                if (ans.isEmpty() || a[i] != ans.get(ans.size() - 1)) {
                    ans.add(a[i]);
                }
                i++;
            } 
            else if (a[i] > b[j]) {
                if (ans.isEmpty() || b[j] != ans.get(ans.size() - 1)) {
                    ans.add(b[j]);
                }
                j++;
            } 
            else {
                if (ans.isEmpty() || a[i] != ans.get(ans.size() - 1)) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // Remaining elements of a[]
        while (i < n) {
            if (ans.isEmpty() || a[i] != ans.get(ans.size() - 1)) {
                ans.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b[]
        while (j < m) {
            if (ans.isEmpty() || b[j] != ans.get(ans.size() - 1)) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3};
        int b[] = {2, 3, 4};

        ArrayList<Integer> result = findUnion(a, b);
        System.out.println(result);
        
    }
}