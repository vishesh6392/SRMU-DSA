package lec34;


import java.util.*;
public class calculateSum {
    static final int mod = 1000000007;
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[], int i, int j){
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static int [] rotateAndsum(int arr[], int k){
           int n=arr.length;
           k=k%n;
           int arr2[]=arr.clone();
           reverse(arr,0,n-1);
           reverse(arr,0,k-1);
           reverse(arr,k,n-1);
           for(int i=0;i<n;i++){
               arr2[i]+=arr[i];
           }
           return arr2;

    }
    public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int q=sc.nextInt();
    //    int res[]=arr.clone();
    //    while(q-->0){
    //        int k=sc.nextInt();
    //        res=rotateAndsum(res,k);
    //    }
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       int res=sum*(int)Math.pow(2,q);
         
       System.out.println(res);
       
    }
}