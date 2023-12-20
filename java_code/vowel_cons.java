import java.util.*;

class v_cons {
    public static void cons(char a) {
        if (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u'
                || a == 'U') {
            System.out.println("vowel");

        } else {
            System.out.println("consonent");

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        // a.toLowerCase();
        cons(a);

    }
}
