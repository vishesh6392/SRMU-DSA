package maths;

import java.util.Scanner;

public class primeSqrt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int cnt=0;
       for(int i=1;i*i<=n;i++){
        if(n%i==0){
            cnt++;
            if(i!=n/i){
                cnt++;
            }
        }
        if(cnt>2){
            System.out.println("break");
            break;
        }
       }
       if(cnt>2) System.out.println("none prime");
       else System.out.println("prime");
       
    }
}
