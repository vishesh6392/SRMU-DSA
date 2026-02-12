package pattern.pattern2;

import java.util.Scanner;

public class pat9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int N=n/2;
        // upper half
        int i=0;
        while(i<N){
            int j=0;
            while(j<N-i){
               System.out.print("*");
               j++;
            }
            j=0;
            while(j<2*i+1){
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<N-i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        // seperate line
        System.out.println();

        // lower half
        i=0;
        while(i<N){
            int j=0;
            while(j<=i){
               System.out.print("*");
               j++;
            }
            j=0;
            while(j<(N *2)-2*i-1){
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
