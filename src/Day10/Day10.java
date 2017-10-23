import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, ct = 0;
        String b = Integer.toBinaryString(n);
        char[] arr = b.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '1') {
                ct++;
            } else
                ct = 0;
            if (ct > count)
                count = ct;
        }
        System.out.println(count);
    }
}