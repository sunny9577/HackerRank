import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            process(N, K);
        }

        sc.close();
    }

    private static void process(int n, int k) {

        int result = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int val = i & j;
                if (val > result && val < k)
                    result = val;
            }
        }
        System.out.println(result);
    }
}
