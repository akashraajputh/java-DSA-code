import java.util.*;

class working {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list1.add(i);
        }
        for (int j = 5; j < 10; j++) {
            list2.add(j);
        }
        System.out.println(list1.get(0));
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(list);
    }
}