package lec38;

import function.swap;

public class nextpermutation {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverseRange(int arr[],int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,4,5,3};
        int pivot=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
           if(arr[i]<arr[i+1]){
              pivot=i;
              break;
           }
        }
        if(pivot==-1){
            reverseRange(arr,0,n-1);
          }
          else{
              for(int i=n-1;i>=0;i--){
                if(arr[pivot]<arr[i]){
                    swap(arr,pivot,i);
                    break;
                }
              }
              reverseRange(arr,pivot+1,n-1);
          }
          for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
          }
    }
}
