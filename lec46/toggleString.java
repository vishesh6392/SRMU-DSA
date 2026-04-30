package lec46;
import java.util.*;

public class toggleString {
    
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<='z' && ch>='a'){
                result+=Character.toUpperCase(ch);
            }
            else{
                result+=Character.toLowerCase(ch);
            }
        }
        System.out.println(result);
    }
}


