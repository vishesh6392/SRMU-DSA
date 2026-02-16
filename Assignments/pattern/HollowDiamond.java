package Assignments.pattern;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int mid=n/2;
        while(i<=mid){
             int j=0;
             if(i==0){
                 while(j<n){
                     System.out.print("*\t");
                     
                     j++;
                 }
             } 
             else{
                 j=0;
                 while(j<=mid-i){
                    System.out.print("*\t"); 
                    j++; 
                 }
                 j=0;
                 while(j<2*i-1){
                     System.out.print("\t");
                     j++;
                 }
                 j=0;
                 while(j<=mid-i){
                    System.out.print("*\t"); 
                    j++; 
                 }
             }
             System.out.println();
             i++;
        }
        i=1;
        while(i<=mid){
             int j=0;
             if(i==mid){
                 while(j<n){
                     System.out.print("*\t");
                     
                     j++;
                 }
             } 
             else{
                 j=0;
                 while(j<=i){
                    System.out.print("*\t"); 
                    j++; 
                 }
                 j=0;
                 while(j<n-2*i-1-1){
                     System.out.print("\t");
                     j++;
                 }
                 j=0;
                 while(j<=i){
                    System.out.print("*\t"); 
                    j++; 
                 }
             }
             System.out.println();
             i++;
        }
    }
}
