package pattern;

import java.util.*;

public class pat9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int row=(2*n-1);
        int N=row/2;
        while (i < N+1) {
             //upper half
             int star=0;
             while(star<i+1){
                System.out.print("*");
                star++;
             }
             
            System.out.println();
            i++;
      } 
        // lowerhalf
        i=0;
         while (i < N) {
             int star=0;
             while(star<N-i){
                System.out.print("*");
                star++;
             }
            System.out.println();
            i++;
      }      
   
        
    }
}

