package maths;

import java.util.Scanner;

public class primeFactorSchool {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int n=sc.nextInt();
        int i=2; 
        while(n>1){
          if(n%i==0)  System.out.println(i);
          while(n%i==0) n=n/i;
          i++;
        }
       }
}
