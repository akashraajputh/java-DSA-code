import java.util.*;

class place_tiles {
    public static int placetiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically
        int vertically = placetiles(n - m, m);
        // horizontally
        int horizontally = placetiles(n - 1, m);
        return vertically + horizontally;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows:");
        int n = sc.nextInt();
        System.out.println("enter the number of column:");
        int m = sc.nextInt();
        System.out.println("total method is: " + placetiles(n, m));
    }
}
