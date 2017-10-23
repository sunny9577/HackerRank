import java.util.Scanner;

/**
 * Created by Sunny on 10/11/2017.
 */
public class Day26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Da = scanner.nextInt();
        int Ma = scanner.nextInt();
        int Ya = scanner.nextInt();
        int De = scanner.nextInt();
        int Me = scanner.nextInt();
        int Ye = scanner.nextInt();

        int fine;

        if (Ya > Ye)
            fine = 10000;
        else if (Ma > Me && Ya >= Ye)
            fine = 500 * (Ma - Me);
        else if (Da > De && Ma <= Me && Ya >= Ye)
            fine = 15 * (Da - De);
        else
            fine = 0;

        System.out.println(fine);
    }
}
