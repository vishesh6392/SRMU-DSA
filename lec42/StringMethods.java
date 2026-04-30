package lec42;
import java.util.*;

public class StringMethods {
    


    public static void main(String[] args) {
        // 1. Length
        System.out.println("Length: " + s1.length());

        // 2. charAt()
        System.out.println("charAt(1): " + s1.charAt(1));

        // 3. substring()
        System.out.println("substring(1,4): " + s1.substring(1, 4));

        // 4. equals() vs ==
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);       // true (same reference)
        System.out.println(a == c);       // false
        System.out.println(a.equals(c));  // true

        // 5. compareTo()
        System.out.println("compareTo: " + a.compareTo("Javb"));

        // 6. toLowerCase() and toUpperCase()
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        // 7. trim()
        String str = "   Hello Java   ";
        System.out.println("Trim: " + str.trim());

        // 8. replace()
        System.out.println(s1.replace('l', 'x'));

        // 9. contains()
        System.out.println(s1.contains("ell"));

        // 10. startsWith() / endsWith()
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.endsWith("lo"));

        // 11. indexOf() / lastIndexOf()
        String t = "banana";
        System.out.println(t.indexOf('a'));
        System.out.println(t.lastIndexOf('a'));

        // 12. split()
        String line = "Java is fun";
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));

        // 13. join()
        String joined = String.join("-", "A", "B", "C");
        System.out.println(joined);

        // 14. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println(numStr + "123");

        // 15. toCharArray()
        char[] arr = s1.toCharArray();
        System.out.println(Arrays.toString(arr));

        // 16. isEmpty()
        String empty = "";
        System.out.println(empty.isEmpty());

        // 17. concat()
        System.out.println(s1.concat(" " + s2));

        // 18. equalsIgnoreCase()
        System.out.println("java".equalsIgnoreCase("JAVA"));

    }
}