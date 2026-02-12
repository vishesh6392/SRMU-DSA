package pattern.pattern2;

import java.util.Scanner;

public class pat7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int j=0;
            if(i==0){
               while(j<2*n-1){
                System.out.print("*");
                j++;
               }
            }
            else{
                j=0;
                while(j<n-i){
                    System.out.print("*");
                    j++;
                }
                j=0;
                while(j<2*i-1){
                  System.out.print(" ");
                  j++;
                }
                j=0;
                while(j<n-i){
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}
