package lec32;

public class gasStaionOptimal {
      public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int start=0;
        int tank=0;
        int total=0;
        for(int i=0;i<n;i++){
             tank+=gas[i]-cost[i];
             total+=gas[i]-cost[i];
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }
        if(total>=0) return start;
        return -1;
    }
    public static void main(String [] args){
         int [] gas={1,2,3,4,5};
        int [] cost={3,4,5,1,2};
        int ans=canCompleteCircuit(gas, cost);
        System.out.println(ans);
    }
}
