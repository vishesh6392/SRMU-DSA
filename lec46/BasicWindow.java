package lec46;

public class BasicWindow {
 public static int slidingWindow(String s, int k){
    int l=0;  //- shrink pointer
    int mxLen=0;
    int cnt=0;
    for(int r=0;r<s.length();r++){
         char ch=s.charAt(r);
         if(ch=='a') cnt++;
         if(cnt==k){
            mxLen=Math.max(mxLen,r-l+1);
         }
         while(cnt>k){
            char ch2=s.charAt(l);
            if(ch2=='a') cnt--;
            l++;
         }
    }
    return mxLen;

 }
 public static void main(String[] args) {
     String s="aabacdaabcaaaabbbcsaa";
     int k=3;
     int ans=slidingWindow(s, k);
     System.out.println(ans);
 }
}
