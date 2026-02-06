package pattern.pattern2;


import java.util.*;

public class pat2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
       
        while (i < n) {
             int sp=0;
             while(sp<2*i){
                System.out.print(" ");
                sp++;
             }
             int star=0;
             while(star<n-i){
                System.out.print("*");
                star++;
             }
            System.out.println();
            i++;
      }    
   
        
    }
}


