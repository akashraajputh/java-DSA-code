import java.uti.*;
import java.util.Scanner;

class move_element {
    public static void moveall(String str, int idx, int count, String newstring, char r) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstring += r;
            }
            System.out.println(newstring);
            return;

        }
        char current = str.charAt(idx);
        if (current == r) {
            count++;
            moveall(str, idx + 1, count, newstring, r);
        } else {
            newstring += current;
            moveall(str, idx + 1, count, newstring, r);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char r = sc.next().charAt(0);
        moveall(str, 0, 0, "", r);
    }
}
