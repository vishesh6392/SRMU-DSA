package lec38;
import java.util.*;
public class MaxSumPath {
    public static int maxpath(int [] arr1,int [] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int maxPath=0;
        int sum1=0;
        int sum2=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i];
                i++;
            }
            else if( arr1[i]>arr2[j]){
                sum2+=arr2[j];
                j++;
            }
            else{
                maxPath+=Math.max(sum1,sum2)+arr1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<n){
            sum1+=arr1[i];
            i++;
        }
        while (j<m) {
            sum2+=arr2[j];
            j++;
        }
        maxPath+=Math.max(sum1,sum2);
       return maxPath;
    }
    public static void main(String[] args) {
        int arr1[]={2,4,5,8,10};
        int arr2[]={4,6,8,9};

        int ans=maxpath(arr1, arr2);
        System.out.println(ans);
    }

    
}
