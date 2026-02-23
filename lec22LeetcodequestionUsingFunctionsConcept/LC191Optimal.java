package lec22LeetcodequestionUsingFunctionsConcept;

import java.util.Scanner;

public class LC191Optimal {
    public static int CountOne(int n) {
          int cnt=0;
          while(n>0){
            int bit=n%2;
            if(bit==1) cnt++;
            n=n/2;
          }
          return cnt;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int cnt=CountOne(n);
         System.out.println(cnt);
    }
}
