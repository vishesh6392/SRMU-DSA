package lec44;
import java.util.*;

public class KthRoot {
  public static long smallestThanN(long n, int k){
        long low=0;
        long high=n;
        long ans=0;
        while(low<=high){
            long mid=(high+low)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        // Your Code Here

        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int k=sc.nextInt();
            long ans=smallestThanN(n,k);
            System.out.println(ans);
        }
    }
}



