package Assignments.pattern;

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int i=0;
        while(i<N){

            int j=0;
            while(j<N-i-1){
                System.out.print(" ");
                j++;
            }
            if(i==0 || i== N-1){
                 j=0;
                while(j<N){
                    System.out.print("*");
                    j++;
                }
            }
            else{
                System.out.print("*");
                 j=0;
                 while(j<N-2){
                     System.out.print(" ");
                     j++;
                 }
                 System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
