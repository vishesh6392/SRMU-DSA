public class SubarraySumTLE {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
            }
        }
    }
}
