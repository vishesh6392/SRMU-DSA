package pattern;

import java.util.*;

public class pat10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        
        while (i <n) {
             int start=0;
             if(i%2==0) start=1;
             int j=0;
             while(j<=i){
                 System.out.print(start);
                 start=start==1?0:1;
                 j++;
             }
            System.out.println();
            i++;
      } 
        
    }
}

