package lec26;

import java.util.Scanner;

public class powerOfTwoLeetcode {
    public static int powerOfwo(int n) {
        int cnt=0;
       while(n>0){
          int digit=n%2;
          if(digit==1) cnt++;
          n=n/2;
       }
       return cnt;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int noOfbitset=powerOfwo(n);
        if(noOfbitset>1) System.out.println(false);
        else System.out.println(true);
    }
}
