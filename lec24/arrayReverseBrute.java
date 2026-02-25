package lec24;

import java.util.Scanner;

public class arrayReverseBrute {
    public static int [] reverse(int[] arr){
         int n= arr.length;
         int[] newArray=new int[n];
         int j=0;
         for(int i=n-1;i>=0;i--){
            newArray[j]=arr[i];
            j++;
         }
         return newArray;
    }
    public static void printArray(int[] arr){
         int n= arr.length;
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }
    }

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         int [] arr= new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }

        printArray(arr);

        int [] newA = reverse(arr);

          System.out.println();

        printArray(newA);
        
    }
}
