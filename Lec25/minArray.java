package Lec25;

public class minArray {
    public static int minNum(int[] arr){
        int n= arr.length;
        int ans=arr[0];
        for(int i=1;i<n;i++){
            if(ans>arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
         int [] arr={1,2,5,-5,-6,3,5};
        int ans=minNum(arr);
        System.out.println(ans);
    }
}
