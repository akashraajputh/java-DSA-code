import java.util.*;

class cons_v {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == '0' || a == 'O' || a == 'u'
                || a == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("consosnent");
        }
    }
}