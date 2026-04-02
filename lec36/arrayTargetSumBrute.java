package lec36;

import java.util.Scanner;

public class arrayTargetSumBrute {
    public static void main(String args[]) {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int target=sc.nextInt();

         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                  if(arr[i]+arr[j]==target){
                     if(arr[i]<arr[j]) System.out.print(arr[i]+" and "+arr[j]);
                     else System.out.print(arr[j]+" and "+arr[i]);
                      System.out.println();
                  }
             }
         }
    }
}
