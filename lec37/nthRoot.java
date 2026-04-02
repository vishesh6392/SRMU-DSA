package lec37;

import java.util.Scanner;

public class nthRoot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean isExist=false;
        for(int i=1;i<m;i++){
            if((int)Math.pow(i,n)==m) {
                isExist=true;
                System.out.println(i);
            }
            
        }
        if(isExist==false) System.out.println("not exist");
    }
}
