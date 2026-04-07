package lec40;

public class FindMissingElements {
    public static void missing(int arr[]){
         int n=arr.length;
         int [] seen= new int[n+1];
         for(int  i=0;i<n;i++){
            int idx=arr[i];
            seen[idx]=1;
         }
         for(int i=1;i<n+1;i++){
            if(seen[i]==0){
                System.out.print(i+" ");
            }
         }
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,7,8,4,4,8};
        missing(arr);
        
    }
}
