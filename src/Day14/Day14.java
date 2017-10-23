import java.util.Scanner;


class Difference {
    public int maximumDifference;
    private int[] elements;

    Difference(int a[]) {
        elements = a;
    }

    void computeDifference() {
        for (int i = 0; i < elements.length; i++) {

            for (int j = 0; j < elements.length; j++) {
                int temp = Math.abs(elements[i] - elements[j]);
                if (temp > maximumDifference)
                    maximumDifference = temp;
            }
        }
    }

}

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}