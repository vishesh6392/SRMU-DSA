package Assignments.pattern;

import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int mid=N/2;
        int i=0;
        while(i<=mid){
             int j=0;
             while(j<mid-i){
                 System.out.print("\t");
                 j++;
             }
             j=0;
             while(j<2*i+1){
                 System.out.print("*\t");
                 j++;
             }
             System.out.println();
             i++;
        }
         i=1;
         while(i<=mid){
             int j=0;
             while(j<i){
                 System.out.print("\t");
                 j++;
             }
             j=0;
             while(j<=N-2*i-1){
               System.out.print("*\t");
               j++;
             }
             System.out.println();
             i++;
         }
    }
}
