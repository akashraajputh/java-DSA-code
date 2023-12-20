import java.util.*;

class total_path {
    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;

        }
        // downwards
        int downpath = countpath(i + 1, j, n, m);
        // move rigth
        int rigth = countpath(i, j + 1, n, m);
        return downpath + rigth;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("enter the number of column");
        int m = sc.nextInt();
        System.out.println("total  path is:-" + countpath(0, 0, n, m));
    }
}