package pattern;

import java.util.*;

public class pat6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
       
        while (i < n) {
             int sp=0;
             while(sp<n-1-i){
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
   
        
    }
}

