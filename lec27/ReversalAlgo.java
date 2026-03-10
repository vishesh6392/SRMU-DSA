package lec27;


public class ReversalAlgo{

 public static  void reverse(int [] arr,int s, int e){
     while(s<=e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
     }
 }

    public static  void rotate(int[] nums, int k) {
          int n=nums.length;
          k=k%n;
          reverse(nums,0,n-1);
          reverse(nums,0,k-1);
          reverse(nums,k,n-1);
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
        display(arr);
    }

}