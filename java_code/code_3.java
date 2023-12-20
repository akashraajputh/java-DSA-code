import java.util.Scanner;

//3.Write a Java Program to define a class, define instance methods and overload them and use them for dynamic method 
class code_3 {
    String name;
    int age;

    void age_p(int a) {
        // Scanner sc = new Scanner(System.in);
        if (a > 18) {
            System.out.println("person is eligible for voting:");
        } else {
            System.out.println("person are not eligible for voting:");
        }
    }

    void name_p(int name) {
        System.out.println("name of person is:" + name);
    }

}

class myinfo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(system.in);
        String name = sc.next();
        int age = sc.nextInt();
        age_p(age);
        name_p(name);
    }
}