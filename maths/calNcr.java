package maths;

import java.util.Scanner;

public class calNcr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int ans=1;
        for(int i=0;i<r;i++){
           ans=ans*((n-i)/(i+1));
        }
        System.out.println(ans);
    }
}
