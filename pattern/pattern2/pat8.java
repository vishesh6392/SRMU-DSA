package pattern.pattern2;

import java.util.Scanner;

public class pat8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // upper half
        int i=0;
        while(i<n){
            int j=0;
            while(j<n-1-i){
                System.out.print("  ");
                j++;
            }
            j=0;
            while(j<n-i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        // lower half
        i=1;
         while(i<n){
            int j=0;
            while(j<i){
                System.out.print("  ");
                j++;
            }
            j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
