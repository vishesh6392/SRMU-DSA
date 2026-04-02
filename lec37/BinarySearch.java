package lec37;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int t=3;
        int low=0;
        int n= arr.length;
        int high=n-1;
        boolean found=false;
        while(low<=high){
            int mid= (high+low)/2;
            if(arr[mid]==t) {
                System.out.println(mid);
                 found= true;
                break;
            }
            else if(arr[mid]>t){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(found==false) System.out.println("not found");

    }
}
