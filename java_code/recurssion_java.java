import java.util.*;

class recurssion_java {
    public static void printreverse_m(String str, int idx) {
        if (idx == -1) {
            // System.out.println(str);
            return;
        }

        System.out.print(str.charAt(idx));
        printreverse_m(str, idx - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string which u want to teverse:");
        String str = sc.next();
        System.out.println("reversed string is:");
        printreverse_m(str, str.length() - 1);

    }
}