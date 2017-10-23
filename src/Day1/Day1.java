import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine();
        String ss = scan.nextLine();
        System.out.println(i + j);
        System.out.println(d + e);
        System.out.println(s + ss);
        scan.close();
    }
}
