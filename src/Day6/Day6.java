import java.util.Scanner;

public class Day6 {

    static void functionn(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.print(" ");
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Day6. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            functionn(s);
        }
    }
}