package lec42;

public class StringBasics {
    public static void main(String[] args) {
		
		String s1 = "Hello";// pool
		String s2 = "Hello";

		String s3 = new String("Hello");
		String s4 = new String("Hello");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s1 == s2);// address compare
		System.out.println(s3 == s4);// address compare
		System.out.println(s3 == s1);// address compare

		int[] arr = new int[7];
		System.out.println(arr.length);
		System.out.println(s1.length());

		s1 = s1 + "bye";
        System.out.println(s1);

		s2 = s2 + s3;
        System.out.println(s2);

		s3 = s3 + s4;
        System.out.println(s3);

		s2 = s2.concat("okay");// s2= s2+ "okay";
        System.out.println(s2);

		String s5 = "hello" + "bye";// pool
        System.out.println(s5);


		String h1 = "hello";
		String h2 = h1 + new String(" bye");
		String h3 = h1 + new String(" bye");
		System.out.println(h2==h3);

	}
}

