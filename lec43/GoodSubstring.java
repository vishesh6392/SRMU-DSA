package lec43;

import java.util.Scanner;

public class GoodSubstring {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(longestSubString(s));

	}

	public static int longestSubString(String s) {
		int ans = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isvowels(ch)) {
				count++;
			} else {
				ans = Math.max(ans,count);
			    count = 0;
			}
		}
		ans = Math.max(ans, count);
		return ans;

	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;

	}
}
