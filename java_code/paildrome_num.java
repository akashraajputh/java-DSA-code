import java.util.*;

class paildrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int r, temp, sum = 0;
        temp = n;
        while (n != 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        System.out.println("number is:");
        if (sum == temp) {
            System.out.println("paildrome");
        } else {
            System.out.println("not paildrome");
        }
    }
}
