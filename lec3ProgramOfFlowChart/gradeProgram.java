package lec3ProgramOfFlowChart;
import java.util.*;
public class gradeProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>100){
          System.out.println("please give valid Input");
        }
        else if(mark>75){
          System.out.println("Grde A");
        }
        else if(mark>50){
           System.out.println("Grde B");
        }
        else if(mark>25){
           System.out.println("Grde C");
        }
        else{
          System.out.println("fail");
        }
    }
}
