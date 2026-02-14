package maths;

import java.util.Scanner;

public class GcdLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        int ans=1;
        while(i<=Math.min(a,b)){
            if(a%i==0 && b%i==0){
                ans=i;   
            }
            i++;
        }
        System.out.println(ans);
    }
}
