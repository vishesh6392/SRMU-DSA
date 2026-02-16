package Assignments.pattern;

import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int mid=sc.nextInt()-1;
        
           int i=0;

    while(i<=mid){
        int j=0;
        int num=i+1;
          while(j<mid-i){
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
    // lower half
    i=1;
    while(i<=mid){
        int j=0;
        int num=mid+1-i;
          while(j<i){
              System.out.print("\t");
              j++;
          }
          j=0;
          while(j<=(mid*2+1-2*i)/2){
            System.out.print(num+"\t");
            num++;
            j++;
          }
          num=num-2;
          while(j<(mid*2+1-2*i)){
            System.out.print(num+"\t");
            num--;
            j++;
          }
       System.out.println();
       i++;
    }
    }
}
