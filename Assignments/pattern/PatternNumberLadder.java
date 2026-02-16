package Assignments.pattern;

import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       int N= sc.nextInt();
       int i=0;
       int num=1;
       while(i<N){
           int j=0;
           while(j<=i){
               System.out.print(num+"\t");
               num++;
               j++;
           }
           System.out.println();
           i++;
       }
    }
}
