
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
import java.util.*;

class permutation_back {
    public static void permutation_m(ArrayList<Integer> num, ArrayList<Integer> list5, ArrayList<List<Integer>> list,
            int idx) {
        if (num.size() == 0) {
            System.out.println(list);
            return;
        }

        for (int i = 0; i < num.size(); i++) {
            int a = num.get(i);
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                list2.add(num.get(j));
            }
            for (int m = 0; m <= i + 1; m++) {
                list3.add(num.get(m));
            }
            ArrayList<Integer> list4 = new ArrayList<>();
            list4.addAll(list2);
            list4.addAll(list3);
            permutation_m(list4, list5.add(a), list.add(list5), idx + 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            num.add(i);
        }
        System.out.println(num);

        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        permutation_m(num, list5, list, 0);
    }
}
