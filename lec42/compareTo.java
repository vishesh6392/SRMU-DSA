package lec42;

public class compareTo {
    public static void main(String[] args) {
		
		String s1 = "VikasKumar";
		String s2 = "Vikas";
		System.out.println(s1.compareTo(s2));// -ve s1<s2 | +ve s1>s2 | 0 s1==s2
		String s3 = "animesh";
		String s4 = "aniket";
		System.out.println(s3.compareTo(s4));
		System.out.println(compareTo(s1, s2));
		System.out.println(compareTo(s3, s4));
	}

	public static int compareTo(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();

	}
}
