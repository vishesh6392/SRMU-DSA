package pattern;

import java.util.*;

public class pat11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        
        while (i <n) {
             int star=0;
             int num=1;
             while(star<=i){
                 System.out.print(num);
                 num++;
                 star++;
             }
             int sp=0;
             while(sp<2*n-2*i-2){
                System.out.print(" ");
                sp++;
             }
              star=0;
             num=num-1;
             while(star<=i){
                System.out.print(num);
                num--;
                star++;
             }
            System.out.println();
            i++;
      } 
        
    }
}

