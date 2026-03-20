public class sortcolortwopointer {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        int n=arr.length;
        int a=0;
        int b=n-1;
        for(int i=0;i<b;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[a];
                arr[a]=temp;
                a++;
            }
            else if(arr[i]==2){
                int temp=arr[i];
                arr[i]=arr[b];
                arr[b]=temp;
                b--;
            }
         } 
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
