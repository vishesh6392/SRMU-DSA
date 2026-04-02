package lec37;
import java.util.*;

public class fistVersionBad{

    //  API
    static int bad = 4; // first bad version

    public static boolean isBadVersion(int version) {
        return version >= bad;
    }

    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int n = 10;

        int ans = firstBadVersion(n);
        System.out.println("First Bad Version: " + ans);
    }
}