public class maxSubarraySumTLE {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
             int sum=0;
            for(int j=i;j<n;j++){
                 sum+=arr[j];
              
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
