import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int result;
        try {
            result = Integer.parseInt(S);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Bad String");
        }


    }
}