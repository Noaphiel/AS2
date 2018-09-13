import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * The code is documentation enough.
 *
 * @author Sven
 */
public class Thema1 {

    public static void main(String[] args) {

        // 1.
        Random rng = new Random();
        System.out.println(rng.nextInt(10) + 1);

        // 2.
        Date date = new Date();
        System.out.println(date);

        // 3.
        System.out.println(LocalDate.now());

        // 4.
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().equals(sc.nextLine()));

        // 5.
        int[] num1 = new int[3];
        int[] num2 = new int[3];
        for (int i = 0; i < 3; i++) {
            num1[i] = sc.nextInt();
        }
        for (int j = 0; j < 3; j++) {
            num2[j] = sc.nextInt();
        }
        Arrays.sort(num1);
        Arrays.sort(num2);
        System.out.println(Arrays.equals(num1, num2));

        sc.close();
    }
}