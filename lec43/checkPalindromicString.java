package lec43

public class checkPalindromicString {
    
    public static boolean isPal(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
         String s="aabbaa";
         System.out.println(isPal(s));
    }
}
