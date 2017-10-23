import java.util.Scanner;

/**
 * Created by Sunny on 10/11/2017.
 */
public class Day25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            checkPrime(n);
        }
    }

    private static void checkPrime(int n) {

        if (n == 1) {
            System.out.println("Not prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");

    }
}
