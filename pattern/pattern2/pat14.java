package pattern.pattern2;

import java.util.Scanner;

public class pat14 {
   public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int mid=n/2;
    int i=0;
    while(i<=mid){
        int j=0;
        int num=i+1;
          while(j<mid-i){
              System.out.print(" ");
              j++;
          }
          j=0;
          while(j<=(2*i+1)/2){
            System.out.print(num);
            num++;
            j++;
          }
          num=num-2;
          while(j<(2*i+1)){
            System.out.print(num);
            num--;
            j++;
          }
       System.out.println();
       i++;
    }
    i=1;
    while(i<=mid){
        int j=0;
        int num=mid+1-i;
          while(j<i){
              System.out.print(" ");
              j++;
          }
          j=0;
          while(j<=(n-2*i)/2){
            System.out.print(num);
            num++;
            j++;
          }
          num=num-2;
          while(j<(n-2*i)){
            System.out.print(num);
            num--;
            j++;
          }
       System.out.println();
       i++;
    }

   }
}
