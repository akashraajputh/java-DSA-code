import java.util.*;

class duplicate {
    public static boolean[] map = new boolean[26];

    public static void removeduplicate(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }
        char current = str.charAt(idx);
        if (map[current - 'a'] == true) {
            // removeduplicate(str, idx + 1, newstring);
        } else {
            newstring += current;
            // map[current - 'a'] = true;
            removeduplicate(str, idx + 1, newstring + current);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        removeduplicate(str, 0, "");
    }

}