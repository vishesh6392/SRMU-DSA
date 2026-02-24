package lec23;

import java.util.Scanner;

public class leetcode191 {
    public static int revBit(int n) {
          int ans=0;
          int bit=31;
          while(n>0){
             int r=n%2;
             ans=ans+ r*(int)Math.pow(2, bit);
             bit--;
             n=n/2;
          }
          return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=revBit(n);
        System.out.println(ans);
    }
}
