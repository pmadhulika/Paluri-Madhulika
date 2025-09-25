import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int terms = (a % 2 == 0) ? a - 1 : a;  // Even → previous odd, Odd → itself

        for (int i = 1, count = 0; count < terms; i += 2, count++) {
            System.out.print(i + (count < terms - 1 ? ", " : ""));
        }
    }
}
