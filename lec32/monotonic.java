package lec32;

public class monotonic {
     public static boolean isIncr(int [] arr){
          int el=arr[0];
          for(int i=1;i<arr.length;i++){
              if(el<=arr[i]){
                 el=arr[i];
              }
              else{
                 return false;
              }
          }
          return true;
     }

    public static boolean isDcr(int [] arr){
          int el=arr[0];
          for(int i=1;i<arr.length;i++){
              if(el>=arr[i]){
                 el=arr[i];
              }
              else{
                 return false;
              }
          }
          return true;
     }
    public static boolean isMonotonic(int[] nums) {
         return isIncr(nums) || isDcr(nums);
    } 

    public static void main(String[] args[]){
        int [] arr={1,2,3,4,5,6};
        boolean ans=isMonotonic(arr);
        System.out.print(ans);
    }

}
