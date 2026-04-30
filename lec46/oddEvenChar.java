package lec46;
import java.util.*;

public class oddEvenChar {
        public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
               result+=(++ch);
            }
            else{
                result+=(--ch);
            }
        }
        System.out.println(result);

    }
}


