package lec27;

public class majorityEleMoore{

     public static int majorityElement(int[] nums) {
         int n=nums.length;
         int element=nums[0];
         int vote=1;
         int i=1;
         while(i<n){
             if(nums[i]==element){ vote++;}
             else{
                 vote--;
                 if(vote==0){
                    element=nums[i];
                    vote=1;
                 }
             }
             i++;
         }
         return element;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int ans= majorityElement(arr);
        System.out.println(ans);
    }
}