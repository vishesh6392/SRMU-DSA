package maths;

import java.util.Scanner;

public class countOfdigit {
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int cnt=0;
        while(num>0){
            
            cnt=cnt+1;
            num/=10;
        }
        System.out.println("Count of Digits: "+ cnt);
        sc.close();
    }
}
