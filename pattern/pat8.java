package pattern;

import java.util.*;

public class pat8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int row=2*n;
        int N=row/2;
        while (i < N) {
             //upper half
             int sp=0;
             while(sp<N-1-i){
                System.out.print(" "); 
                sp++;
             }
             int star=0;
             while(star<2*i+1){
                System.out.print("*");
                
                star++;
             }
             
            System.out.println();
            i++;
      } 
        // lowerhalf
        i=0;
         while (i < N) {
             int sp=0;
             while(sp<i){
                System.out.print(" "); 
                sp++;
             }
             int star=0;
             while(star<2*N-2*i-1){
                System.out.print("*");
                star++;
             }
            System.out.println();
            i++;
      }      
   
        
    }
}

