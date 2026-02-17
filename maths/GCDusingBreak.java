package maths;

import java.util.Scanner;

public class GCDusingBreak {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=Math.min(a,b);
        int i=ans;
        while(i>=1){
            if(a%i==0 && b%i==0){
                ans=i;
                break;   
            }
            i--;
        }
        System.out.println(ans);
    }
}
