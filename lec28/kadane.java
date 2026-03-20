public class kadane {
    public static void main(String[] args) {
        int arr[]={-1,4,5,6,7,0,4,3,1};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(sum<0){
                 sum=arr[i];
             }
             else{
                sum+=arr[i];
             }
             if(maxSum<sum){
                maxSum=sum;
             }
        }
        System.out.println(maxSum);

    }
}
