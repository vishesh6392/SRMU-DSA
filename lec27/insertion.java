

public  class insertion{

 public static  void  shiftAndsort(int [] arr, int round){
            int temp=arr[round];
            int i=round-1;
            while(i>=0){
                if(temp<arr[i]){
                    arr[i+1]=arr[i];
                }
                else{
                    break;
                }
                i--;
            }
            arr[i+1]=temp;
    }
    public static void insertionSort(int arr[]) {
        // code here
        int n=arr.length;
        for(int round=1;round<n;round++){
             shiftAndsort(arr, round);
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]  args) {
          int [] arr={12,1,7,4,8,2,13};
          insertionSort(arr);
          display(arr);
    }
}