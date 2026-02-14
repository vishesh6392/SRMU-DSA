package maths;

import java.util.Scanner;

public class PrintRowOfPascal {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

     for(int col=0;col<=n;col++){
        int ans=1;
        for(int i=0;i<col;i++){
           ans=(ans*(n-i))/(i+1);
        }
        System.out.print(ans+" ");
    }
    }
}
