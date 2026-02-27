package lec26;

public class bubble {
    public static  void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void bubbleSort(int [] arr){
        int n =arr.length;
        for(int turn=1;turn<n;turn++){
            for(int j=0;j<n-turn;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
