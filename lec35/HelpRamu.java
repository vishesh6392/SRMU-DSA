package lec35;

import java.util.*;
public class HelpRamu {
    public static void solve(int [] riskwa, int []cab, int c1, int c2, int c3, int c4){
        int costRiskwa=0;
        int n=riskwa.length;
        for(int i=0;i<n;i++){
            costRiskwa+=Math.min(riskwa[i]*c1, c2);
        }
        costRiskwa=Math.min(costRiskwa,c3);
        int cabCost=0;
        for(int i=0;i<cab.length;i++){
              cabCost+=Math.min(cab[i]*c1,c2);
        }
        cabCost=Math.min(cabCost,c3);
        int  totalCost=Math.min(cabCost+costRiskwa,c4);
        System.out.println(totalCost);

    }
    public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int t= sc.nextInt();
       while(t-->0){
             int c1=sc.nextInt();
       int c2=sc.nextInt();
       int c3 = sc.nextInt();
       int c4= sc.nextInt();

       int n=sc.nextInt();
       int m= sc.nextInt();
       int riks[]= new int[n];
       int [] cab= new int[m];
       for(int i=0;i<n;i++){
           riks[i]=sc.nextInt();
       }
        for(int i=0;i<m;i++){
           cab[i]=sc.nextInt();
       }

        solve(riks,cab,c1,c2,c3,c4);
       }
       
    }
}
