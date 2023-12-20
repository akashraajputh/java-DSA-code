import java.util.*;

import jav.util.*;

class power {
    public static int calp(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xpow1 = calp(x, n - 1);
        int xpow = x * xpow1;
        return xpow;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base case:");
        int x = sc.nextInt();
        System.out.println("enter the power:");
        int n = sc.nextInt();
        System.out.println("required Value:" + calp(x, n));
    }
}