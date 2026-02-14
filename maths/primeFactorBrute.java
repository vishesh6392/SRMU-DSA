package maths;

import java.util.Scanner;

public class primeFactorBrute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
     
       for(int i=1;i<=n;i++){
        if(n%i==0){    // check divisor if yes
            // check prime
            int cnt=0;
            for(int j=1;j<=i;j++){
                if(i%j==0) cnt++;
            }
            if(cnt==2) System.out.println(i);

        }
       }
       
    }
}
