package pattern.pattern2;


import java.util.*;

public class pat5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
       
        while (i < n) {
            if(i==0){
                int star=0;
                while(star<2*n-1){
                    System.out.print("*");
                    star++;
                }
            }
            else{

             int star=0;
             while(star<n-i){
                System.out.print("*");
                star++;
             }
                  int sp=0;
             while(sp<2*i-1){
                System.out.print(" ");
                sp++;
             }
             star=0;
             while(star<n-i){
                System.out.print("*");
                star++;
             }
            }
          
            System.out.println();
            i++;
      }    
   
        
    }
}


