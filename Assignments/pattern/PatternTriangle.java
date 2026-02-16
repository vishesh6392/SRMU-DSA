package Assignments.pattern;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int i=0;
           
         while(i<n){
             int j=0;
             int num=i+1;
             while(j<n-i-1){
                 System.out.print("\t");
                 j++;
             }
             j=0;
             while(j<=(2*i+1)/2){
                 System.out.print(num+"\t");
                 num++;
                 j++;
             }
             num=num-2;
              while(j<(2*i+1)){
                 System.out.print(num+"\t");
                 num--;
                 j++;
             }
             System.out.println();
             i++;
            }
    }
}
