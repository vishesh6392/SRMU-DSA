public class pivotIndexLeetcode {

     public static int pivotIdx(int arr[]){
         int n=arr.length;
         int presum[]= new int[n];
          presum[0]=arr[0];
          for(int i=1;i<n;i++){
            presum[i]=presum[i-1]+arr[i];
          }
        
          for(int i=0;i<n;i++){
             int left=presum[i]-arr[i];
             int right= presum[n-1]-presum[i];
             if(left==right){
                return i;
             }

          }
          return -1;
     }
    public static void main(String[] args) {
         int arr[]= {1,2,2,1,4,6};
        
         int ans= pivotIdx(arr);
         System.out.println(ans);
          
    }
}
