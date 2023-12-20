import java.util.Scanner;

class studet {
    String name;
    int a, b, c, d;

    int average() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        double av = (a + b + c + d) / 4;
        return av;
    }

}
