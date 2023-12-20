import java.util.*;

class fibonacci_2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the number of the series:");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.println("required series is:");
        System.out.print(n1 + " ");
        System.out.print(n2);
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}