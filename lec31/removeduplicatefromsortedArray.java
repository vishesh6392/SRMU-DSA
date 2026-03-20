public class removeduplicatefromsortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4};
        int n=arr.length;
        int k=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
    }
    }
}
