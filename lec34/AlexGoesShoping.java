package lec34;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int item[]= new int[n];
        for(int i=0;i<n;i++){
             item[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while(q-->0){
            int price=sc.nextInt();
            int neededItem=sc.nextInt();
            int canBuy=0;
            for(int i=0;i<n;i++){
                 if(price%item[i]==0) canBuy++;
            }
            if(canBuy>=neededItem) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
