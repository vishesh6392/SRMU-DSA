package Lec25;

import java.util.Scanner;

public class leetcode7 {
     public static  int rev(int n){
         long revNum=0;
         while(n>0){
            int digit= n%10;
            revNum=revNum*10+digit;
            if(revNum>Integer.MAX_VALUE || revNum<Integer.MIN_VALUE) return 0;
            n=n/10;
         }
         return (int) revNum;
     }
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         int ans = rev(n);
         System.out.println(ans);
     }
}
