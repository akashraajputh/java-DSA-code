import java.util.*;

class recurssion_first_last_occurance {
    public static int first = -1;
    public static int last = -1;

    public static void findoccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("first occurance is:" + first);
            System.out.println("last occurance is:" + last);
            return;
        }
        char currchr = str.charAt(idx);
        if (currchr == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findoccurance(str, idx + 1, element);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char element = sc.next().charAt(0);
        findoccurance(str, 0, element);

    }

}
