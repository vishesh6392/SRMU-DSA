package lec3ProgramOfFlowChart;
import java.util.*;
public class maxOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a>=b && a>=c) System.out.println("max is:"+a);
        else if( b>=a && b>=c) System.out.println("max is:"+b);
        else System.out.println("max is :"+c);
    }
}
