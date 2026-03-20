public class productOfArrayBrute {
    public static void display(int [] arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        int ans[]= new int[n];
        for(int i=0;i<n;i++){
            int  prod=1;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                else{
                    prod=prod*arr[j];  
                }
            }
            ans[i]=prod;
        }
        display(ans);
    }
}
