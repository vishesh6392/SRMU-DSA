package lec46;
import java.util.*;

public class CanyouRead {
 public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);
     String s=sc.next();
     int i=0;
     int j=i+1;
     while( i<s.length() && j<s.length()){
        char ch=s.charAt(j);
        if(ch>='A' && ch<='Z'){
            System.out.println(s.substring(i,j));
            i=j;
        }
            j++;
        
     }
     System.out.println(s.substring(i,j));

    }
}

