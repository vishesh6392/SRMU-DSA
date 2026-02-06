package pattern.pattern2;


import java.util.*;

public class pat3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
       
        while (i < n) {
             int sp=0;
             while(sp<n-i-1){
                System.out.print(" ");
                sp++;
             }
             int star=0;
             while(star<=i){
                System.out.print("* ");
                star++;
             }
            System.out.println();
            i++;
      }    
   
        
    }
}


