package lec24;

import java.util.Scanner;

public class arrayReverseRange {
 public static void reverse(int[] arr,int start, int end){
          while(start<=end){
             swap(arr,start,end);
             start++;
             end--;
          }
        
    }
    public static void swap(int[] arr, int i, int j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
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
        //  let range is 4->8; the size must be greater than 8
        reverse(arr, 4, 8);

          System.out.println();

        printArray(arr);
        
    }

}
