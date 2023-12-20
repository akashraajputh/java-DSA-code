import java.util.*;

class subset_n {
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.println(subset.get(i));
        }
        System.out.println();
    }

    public static void findsubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findsubset(n - 1, subset);
        // add nhi hoga
        subset.remove(subset.size() - 1);
        findsubset(n - 1, subset);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the natural number:");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        System.out.println("subset of given number is:");
        findsubset(n, subset);
    }
}