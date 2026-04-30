package lec46;
import java.util.*;

public class DifferenceInACI {
       public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String result="";
        for(int i=1;i<s.length();i++){
             char ch2=s.charAt(i);
             char ch1=s.charAt(i-1);
             int diff=(ch2-ch1);
             result+=ch1;
             result+=diff;
            //  System.out.println(diff);
        }
        char ch2=s.charAt(s.length()-1);
        result+=ch2;

        System.out.println(result);
    }
}


