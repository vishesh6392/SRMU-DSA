package maths;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev0=0;
        int prev1=1;
        int next=0;
        // if(n==0) System.out.println(prev0);
        // if(n==1) System.out.println(prev1);
         System.out.print(prev0+" ");
         System.out.print(prev1+" ");
        for(int i=2;i<=n;i++){
            next=prev0+prev1;
            prev0=prev1;
            prev1=next;
           System.out.print(next+" ");
        }
    //    if(n!=0 || n!=1)  System.out.println(next);
    }
}
