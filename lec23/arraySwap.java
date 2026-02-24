package lec23;

public class arraySwap {
    public static void swap(int[] arr,int a,int b){
        System.out.println(a +" "+ b);
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(a+" "+b);
        

    }
    public static void main(String[] args) {
        int [] arr= new int[5];
        arr[0]=10;
        arr[1]=5;
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }
        System.out.println();

        swap(arr,0,1);
        System.out.println(arr[0]+" " + arr[1]+"length"+ arr.length);
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }

        
    }
}
