
//import java.util.ArrayList;
import java.util.Scanner;

class Happy_num {
    public static int happynum(int n) {
        int c = 0, sum = 0;

        while (n > 0) {
            c = n % 10;
            sum = sum + (c * c);
            n = n / 10;

        }
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the non negative number:");
        int n = sc.nextInt();
        int rem = n;
        while (rem != 1 && rem != 4) {
            rem = happynum(rem);
        }
        // System.out.println(rem);
        if (rem == 1) {
            System.out.println("happy number:");
        } else {
            System.out.println("not a happy number:");
        }

    }
}