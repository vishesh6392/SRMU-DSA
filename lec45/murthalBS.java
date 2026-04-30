package lec45;
import java.util.*;

public class murthalBS {
        public static int fun(int r,int t){
         int i=1;
         int cnt=0;
         int totalTime=0;
         while(true){
            totalTime+=i*r;
            if(totalTime>t) break;
            cnt++;
            i++;
         }
         return cnt;
    }
    public static boolean isSuff(int []rank,int time,int p){
        int cnt=0;
        for(int i=0;i<rank.length;i++){
            cnt+=fun(rank[i],time);
            if(cnt>=p) return true;
        }
        return  false;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int p=sc.nextInt();
      int n=sc.nextInt();
      int [] rank= new int[n];
      for(int i=0;i<n;i++){
          rank[i]=sc.nextInt();
      }
     Arrays.sort(rank);
      int lowTime=0;
      int highTime=rank[n-1]*((p*(p+1))/2);
      int ans=0;
      while(lowTime<=highTime){
          int mid=(highTime+lowTime)/2;
          if(isSuff(rank,mid,p)){
              ans=mid;
              highTime=mid-1;
          }
          else{
              lowTime=mid+1;
          }
      }
      System.out.println(ans);
    }
}

