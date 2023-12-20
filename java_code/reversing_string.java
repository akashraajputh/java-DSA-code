import java.util.*;

class reversing_string {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // String str = s.next();
        // StringBuilder sb = new StringBuilder(str);
        // StringBuilder strreverse = sb.reverse();
        // System.out.println(strreverse.toString());
        String str = s.nextLine();
        // int c = -1;
        // char arr[] = str.toCharArray();
        // System.out.println(arr);
        // size_t arr_size = *(&arr +1) - arr;
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + "\n");
        }
        System.out.println("prtogram is finisheds");

    }
}
