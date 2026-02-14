package maths;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int place=1;
        int binary=0;
        while(n>0){
           int r=n%2;
           binary=binary+place*r;
           place=place*10;
           n=n/2;
        }
        System.out.println(binary);

    }
}
