package lec36;
import java.util.*;

public class ArrayTargetSumTripletTwoptr {
    public static void tw0ptr(int [] arr, int target, int a ,int ind){
           Arrays.sort(arr);
           int n=arr.length;
           int i=ind+1;
           int j=n-1;
           while(i<j){
               int sum=a+arr[i]+arr[j];
               if(sum==target){
                  System.out.print(a +", "+arr[i] +" and " +arr[j]);
                  System.out.println();
                   i++;
                   j--;
               }
               else if(sum<target){
                   i++;
               }
               else{
                   j--;
               }
           }
       
    }
    public static void main(String args[]) {
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            tw0ptr(arr,target,arr[i],i);
            // for(int j=i+1; j<n-1;j++){
            //     for(int k=j+1;k<n-2;k++){
            //         if(arr[i]+arr[j]+arr[k]==target){
                        
            //             System.out.print(arr[i] +", "+arr[j] +" and " +arr[k]);
            //         }
            //     }
            //     System.out.println();
            // }
        }
         
    }
}