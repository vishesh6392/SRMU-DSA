package lec22LeetcodequestionUsingFunctionsConcept;

import java.util.Scanner;

public class LC191Brute {
    public static int DecimalToBinary(int dec) {
        int binary=0;
        int place=1;
        while(dec>0){
            int bit=dec%2;
            binary=binary+place*bit;
            place=10*place;
            dec=dec/2;
        }
      return binary;

    }
    
    public static int countOne(int binary) {
          int cnt=0;
          while(binary>0){
            int digit=binary%10;
            if(digit==1) cnt++;
            binary=binary/10;
          }
          return cnt;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int binary=DecimalToBinary(n);
         int cnt=countOne(binary);
         System.out.println(cnt);
    }
}
// think the overflow why this overflow happen etc