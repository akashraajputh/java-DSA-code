import java.util.*;

class permutation_back {
    public static void print_permutation(String str, String per, int idx, ArrayList<List<String>> list,
            ArrayList<String> list1) {
        if (str.length() == 0) {
            list1.add(per);
            // System.out.println(list1);
            // list.add(list1);
            // System.out.println(per);
        }
        for (int i = 0; i < str.length(); i++) {
            char newchr = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i + 1);
            print_permutation(newstring, per + newchr, idx + 1, list, list1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name of person which u like most:");
        String str = sc.next();
        ArrayList<List<String>> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        print_permutation(str, "", 0, list, list1);
        // list.add(list1);
        // System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            ArrayList<String> list2 = new ArrayList<>();
            list2.add(list1.get(i));
            list.add(list2);
        }

        System.out.println("i am able to write ur name like all this way:");
        System.out.println(list);
        System.out.println("ur lucky no from my side is:" + list1.size());
        System.out.println("program is over:");

    }
}
