package lec43;

public class substringGeneration {
    public static void main(String[] args) {
          
        String str="codingIsKey";
          
        for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
    }
}
