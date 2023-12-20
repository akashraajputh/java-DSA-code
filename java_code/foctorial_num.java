import java.util.*;

class fact_torial {
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int sum = n * factorial(n - 1);
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int fct = 1;
        // for (int i = 1; i <= n; i++) {
        // fct *= i;
        // }
        System.out.println(factorial(n));

    }
}
