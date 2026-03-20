public class prefixSuffix {
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=4;
        int [] preSum=new int [n];
        int [] suffixSum= new int[n];
        preSum[0]=arr[0];
        suffixSum[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
             preSum[i]=preSum[i-1]+arr[i];
        }
         for(int i=n-2;i>=0;i--){
            suffixSum[i]=suffixSum[i+1]+arr[i];
        }
         
        display(preSum);
        System.out.println();
        display(suffixSum);
    }
}
