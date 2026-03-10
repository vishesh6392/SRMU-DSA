package lec27;

public class  RotateArrayTLE{
     public static  void shift(int [] arr){
        int n= arr.length;
        int temp=arr[n-1];
        int i=n-2;
        while(i>=0){
            arr[i+1]=arr[i];
            i--;
        }
        arr[0]=temp;
    }
    public static  void rotate(int[] nums, int k) {
          for(int r=1;r<=k;r++){
              shift(nums);
          }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
          int arr[]={1,2,3,4,5,6,7};
          int k=3;
          rotate(arr, k);

          display(arr);

    }  
}