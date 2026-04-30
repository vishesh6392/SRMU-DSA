package lec43;

public class freqArray {
    public static void main(String[] args) {
        int freq[]= new int[26];
        String s="abbababcdesddededddfgh";
        for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			freq[idx]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				char ch = (char) ('a' + i);
				System.out.println(ch + " " + freq[i]);
			}
		}

    }
}
