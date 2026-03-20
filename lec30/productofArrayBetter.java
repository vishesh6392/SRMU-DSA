public class productofArrayBetter {
   
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        int [] preProduct=new int [n];      
        int [] suffixProduct= new int[n];
        int [] ans=new int[n];
        preProduct[0]=arr[0];
        suffixProduct[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
             preProduct[i]=preProduct[i-1]*arr[i];
        }
         for(int i=n-2;i>=0;i--){
            suffixProduct[i]=suffixProduct[i+1]*arr[i];
        }
        for(int i=0;i<n;i++){
            int left=1;
            int right=1;
            if(i>0){
                left=preProduct[i-1];
            }
            if(i<n-1){
                right=suffixProduct[i+1];
            }
            ans[i]=left*right;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }


}
