package lec33;
import java.util.*;

public class ArrayTargetSumTwoptr {
    




    public static void twoptr(int arr[],int target){
         Arrays.sort(arr);
         int n=arr.length;
         int i=0;
         int j=n-1;
         while(i<j){
             if(arr[i]+arr[j]==target){
                 
                 System.out.print(arr[i]+" and "+arr[j]); 
                 System.out.println();
                 i++;
                 j--;
             }
             else if(arr[i]+arr[j]<target) i++;
             else j--;

         }
         
    }
    
    public static void main(String args[]) {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int target=sc.nextInt();

         twoptr(arr,target);

    }
}
