package Assignments.pattern;

import java.util.Scanner;

public class PatternwithZeros {
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       int i=0;
       while(i<n){
           int j=0;
           while(j<=i){
                if(j==0 || j==i){
                     System.out.print(i+1+"\t");
                }
                else{
                    System.out.print(0+"\t");
                }
                j++;
           }
           System.out.println();
           i++;
       }
    }
}
