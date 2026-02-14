package maths;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int copy=n;
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        n=copy;
        int sum=0;
        while(n>0){
          int d=n%10;
          int powerdigit=1;
          for(int i=1;i<=cnt;i++){
               powerdigit=powerdigit*d;
          }
          sum=sum+powerdigit;
          n=n/10;
        }

        if(copy==sum) System.out.println("yes");
        else System.out.println("no");
    }
}
