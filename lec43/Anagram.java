package lec43;

public class Anagram {

      int [] freqArray(String t){
        int [] map= new int[26];
        for(int i=0;i<t.length();i++){
            int idx= t.charAt(i)-'a';
            map[idx]=map[idx] + 1;
        }
        return map;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] mp=freqArray(t);
         
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp[ch-'a']==0) return false;
            else mp[ch-'a']=mp[ch-'a']-1;
        }
        return true;
    }
    public static void main(String[] args) {
         String s="anagram";
         String t="nagaram";
         System.out.println(isAnagram(s,t));
    }
}

