package lec22LeetcodequestionUsingFunctionsConcept;

import java.util.Scanner;

public class LC693 {
    public static boolean  check(int n){
          int prevBit=n%2;
          n=n/2;
          while(n>0){
            int nextBit=n%2;
            if(nextBit==prevBit) return false;
            prevBit=nextBit;
            n=n/2;
          }
          return true;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=check(n);
        System.out.println(ans);
    }
}
