package pattern;

import java.util.*;

public class pat15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        
        while (i <n) {
             int j=0;
             char ch='A';
             while(j<n-i){
                 System.out.print(ch);
                 ch++;
                 j++;
             }
            System.out.println();
            i++;
      } 
        
    }
}

