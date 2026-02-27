package lec26;

public class selection {
    public static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_idx=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            swap(arr,i,min_idx);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
