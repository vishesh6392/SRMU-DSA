package  lec3ProgramOfFlowChart;
import java.util.Scanner;
class simple{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int R=sc.nextInt();
        int T=sc.nextInt();

        // process
        int si=(P*R*T)/100;
        System.out.println(si);
    }
}