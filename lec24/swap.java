package lec24;

import java.util.Scanner;

public class swap {
        public  static void swaptwo(int a,int b){
            int temp=a;
            a=b;
            b=temp;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int [] arr= new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            swaptwo(arr[0],arr[1]);
             System.out.println();
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

        }
}
