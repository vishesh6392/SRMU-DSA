public class sortColorLeetcodeUsingcntvariable {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        int n=arr.length;
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                cnt0++;
            }
            else if(arr[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        int k=0;
        while(cnt0>0){
            arr[k++]=0;
            cnt0--;
        }
        while(cnt1>0){
            arr[k++]=1;
            cnt1--;
        }
        while(cnt2>0){
            arr[k++]=2;
            cnt2--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
