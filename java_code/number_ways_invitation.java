import java.util.*;

class call_guest {
    public static int callguest(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int way1 = callguest(n - 1);
        // double
        int way2 = callguest(n - 1) * callguest(n - 2);
        return way1 + way2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the number of the guest:");
        int n = sc.nextInt();
        System.out.println("total no of the ways to calling the guest is:" + callguest(n));
    }
}