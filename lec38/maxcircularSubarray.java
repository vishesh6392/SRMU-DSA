package lec38;

import java.util.Scanner;

public class maxcircularSubarray {

     public static int minSum(int [] nums){
        int n=nums.length;
        int curr=nums[0];
        int mn=nums[0];
        for(int i=1;i<n;i++){
             if(curr>0){
                curr=nums[i];
             }
             else{
                 curr+=nums[i];
             }
             mn=Math.min(curr,mn);
        }
        return mn;
    }
     public static int maxSum(int [] nums){
        int n=nums.length;
        int curr=nums[0];
        int mx=nums[0];
        for(int i=1;i<n;i++){
             if(curr<0){
                curr=nums[i];
             }
             else{
                 curr+=nums[i];
             }
             mx=Math.max(curr,mx);
        }
        return mx;
    }
     public static int totalsum(int [] nums){
        int n=nums.length;
        int curr=nums[0];
        for(int i=1;i<n;i++){
            curr+=nums[i];
        }
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int mxSub=maxSum(arr);
        if(mxSub<0){ System.out.println(mxSub);}
        else{
        int circularMax= totalsum(arr)-minSum(arr);
        int ans=Math.max(mxSub,circularMax);
        System.out.println(ans);
        }
    }
}

