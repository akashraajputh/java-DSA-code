import java.util.*;

import javax.swing.plaf.synth.SynthScrollPaneUI;

class fibonacci {
    public static void fib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fib(b, c, n - 1);
    }

    public static void main(String args[]) {
        System.out.println("enter the length of the fibo:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("total fibonacci series is:");
        System.out.println(a);
        System.out.println(b);
        fib(a, b, n - 2);
        System.out.println("program is finished:");
    }
}