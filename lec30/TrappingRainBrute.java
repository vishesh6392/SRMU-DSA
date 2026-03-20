public class TrappingRainBrute {
   public static int findleftmx(int arr[], int n){
     int mx=arr[n];
     for(int i=0;i<n;i++){
         if(arr[i]>mx){
             mx=arr[i];
         }
     }
     return mx;

    }
    public static int findrightmx(int arr[], int n){
        int mx=arr[n];
        for(int i=n+1;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        int n=arr.length;   
        int water=0;
        for(int i=0;i<n;i++){
            int leftmx=findleftmx(arr,i);
            int rightmx=findrightmx(arr,i);
            water=water+Math.min(leftmx, rightmx)-arr[i];
        }
        System.out.println(water);
    }
}
