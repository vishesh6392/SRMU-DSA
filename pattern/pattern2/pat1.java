package pattern.pattern2;

import java.util.*;

public class pat1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
       
        while (i < n) {

            int sp=0;
            while(sp<n-i){
                System.out.print(" ");
                sp++;
            }
            int j=0;

             while(j<i+1){
                System.out.print("*");
                j++;
             }
            System.out.println();
            i++;
      }    
   
        
    }
}


