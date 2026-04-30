package lec45;
import java.util.*;

public class AggressiveCows {
        public static boolean canPlaceCow(int [] stall, int d, int c){
        int cntCow=1;
        int prev=0;
        for(int i=1;i<stall.length;i++){
            int dis=stall[i]-stall[prev];
            if(dis>=d){
                cntCow++;
                prev=i;
            }
        }
        return cntCow>=c;
    }
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int c=sc.nextInt();
      int [] stall= new int[n];
      int mx=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
          stall[i]=sc.nextInt();
          mx=Math.max(mx,stall[i]);
      }
      Arrays.sort(stall);
      int ans=0;
    //   for(int d=1;d<=mx;d++){
    //       if(canPlaceCow(stall,d,c)){
    //           ans=d;
    //       }
    //   }
    int low=1;
    int high=mx;
    while(low<=high){
        int d=(high+low)/2;
        if(canPlaceCow(stall,d,c)){
            ans=d;
            low=d+1;
        }
        else{
            high=d-1;
        }
    }
      System.out.println(ans);


    }
}

