package pattern.pattern2;

import java.util.Scanner;

public class pat13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        while (i < n) {
            int j = 0;
            int num = 1;
            while (j < n - i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j <= (2 * i + 1) / 2) {
                System.out.print(num);
                num++;
                j++;
            }
            num = num - 2;
            while (j < 2 * i + 1) {
                System.out.print(num);
                num--;
                j++;
            }
          System.out.println();
        i++;
        }
        
    }

}

