package lec32;

public class gasStationBruteTLE {
     public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for(int i=0;i<n;i++){
            int tank=gas[i]-cost[i];
            if(tank<0) continue;
            int j=(i+1)%n;
            while(j!=i){
                 tank=tank-cost[j]+gas[j];
                 if(tank<0) break;
                 j=(j+1)%n;
                 
            }
            if(j==i && tank>=0) return i;
        }
        return -1;
    }
    public static void main(String [] args){
        int [] gas={1,2,3,4,5};
        int [] cost={3,4,5,1,2};
        int ans=canCompleteCircuit(gas, cost);
        System.out.println(ans);

    }
}
