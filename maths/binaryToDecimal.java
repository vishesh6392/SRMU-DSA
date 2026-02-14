package maths;

import java.util.*;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary= sc.nextInt();
        int decimal=0;
        int cnt=0;
        while(binary>0){
            int r=binary%10;
            decimal=decimal+r*(int)(Math.pow(2,cnt));
            cnt++;
            binary=binary/10;
        }
        System.out.println(decimal);
    }
}
