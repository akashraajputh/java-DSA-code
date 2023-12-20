import java.util.*;

class tower_h {
    public static void tower_han(int n, String str, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer " + n + " from " + str + " to " + dest);
            return;
        }
        tower_han(n - 1, str, dest, helper);
        System.out.println("transfer " + n + " from " + str + " to " + dest);
        tower_han(n - 1, helper, str, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of plate at the Starting point:");
        int n = sc.nextInt();
        tower_han(n, "S", "H", "D");
    }
}