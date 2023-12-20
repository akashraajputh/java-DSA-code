import java.util.*;

class sequence {
    public static void permutation(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }
        char currentchar = str.charAt(idx);
        // to be
        permutation(str, idx + 1, newstring + currentchar);
        // not to be
        permutation(str, idx + 1, newstring);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of person which u want most:");
        String str = sc.next();
        System.out.println("all possible combination is:");

        permutation(str, 0, "");
    }
}