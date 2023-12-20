import java.util.*;

class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of the rows:");
        int m = sc.nextInt();
        n = m / 2;
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i) + " ".repeat(2 * n + 1 - 2 * i - 1) + "*".repeat(i));

            // System.out.println(" ".repeat(n - i) + "*".repeat(i));
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(n - i + 1) + " ".repeat(2 * i - 2) + "*".repeat(n - i + 1));
        }
    }
}