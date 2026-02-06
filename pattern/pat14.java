package pattern;

import java.util.*;

public class pat14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        char ch='A';
        while (i <n) {
             int j=0;
             while(j<=i){
                 System.out.print(ch);
                 j++;
             }
            System.out.println();
            ch++;
            i++;
      } 
        
    }
}

