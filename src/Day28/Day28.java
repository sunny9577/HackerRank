import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Day28 {

    public static void main(String[] args) {

        List<String> list = new ArrayList();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern pattern = Pattern.compile("@gmail.com");


        for (int i = 0; i < n; i++) {

            String name = sc.next();
            String email = sc.next();

            if (pattern.matcher(email).find()) {
                list.add(name);
            }
        }
        Collections.sort(list);

        for (String nm : list) {
            System.out.println(nm);
        }
    }
}