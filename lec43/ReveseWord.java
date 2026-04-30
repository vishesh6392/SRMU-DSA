package lec43;

public class ReveseWord {
    public static void main(String[] args) {
		String s = "      the sky        is blue     ";
	
		s = s.trim();
		System.out.println(s);
		String[] arr = s.split(" +");
		
		String ans="";
		for(int i=arr.length-1; i>=0; i--) {
			ans=ans+arr[i]+" ";
		}
		System.out.println(ans);
	}

}
