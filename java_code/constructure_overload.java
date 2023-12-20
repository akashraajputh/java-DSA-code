
//constructure overflow
import java.util.*;

class c_overflow {
    int id;
    String name;
    int age;

    // creating two arg constructor
    c_overflow(int i, String n) {
        id = i;
        name = n;

    }

    c_overflow(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st id");
        int a = sc.nextInt();
        System.out.println("enter 1st name");
        String b = sc.next();
        // Scanner sc = new Scanner(System.in);
        System.out.println("enter 2st id");
        int a1 = sc.nextInt();
        System.out.println("enter 2st name");
        String b1 = sc.next();
        System.out.println("enter age");
        int ag = sc.nextInt();
        c_overflow s1 = new c_overflow(a, b);
        c_overflow s2 = new c_overflow(a1, b1, ag);
        s1.display();
        s2.display();
    }

}
