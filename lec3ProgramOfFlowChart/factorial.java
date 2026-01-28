package lec3ProgramOfFlowChart;
import  java.util.*;
public class factorial {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=1;
    while(n>1){
        fact=fact*n;
        n=n-1;
    }
    System.out.println(fact);
  }
}
