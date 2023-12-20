import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

class bank {
    public void bankinfo(int n) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Account number: ");
            int Acc = sc.nextInt();
            list1.add(Acc);
            System.out.print("Enter the Account type: ");
            int acct = sc.nextInt();
            list1.add(acct);
            // System.out.print("Enter the name: ");
            // String name = sc.next();
            // list1.add(name);
            System.out.print("enter the balance: ");
            int balance = sc.nextInt();
            list1.add(balance);
            list.add(list1);
            System.out.println(list1);

        }
        System.out.println(list);
        System.out.println("*** Banking System Application***");
        System.out.println("1. Display all Account details:");
        System.out.println("2. Search by account number");
        System.out.println("3.deposite the Amount");
        System.out.println("4.Withdra the amount");
        System.out.println("5.Exit");
        int m = sc.nextInt();
        switch (m) {
            case 1:
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("account details:" + list.get(i));
                }
            case 2:
                System.out.println("enter the Account number which you wants to search:");
                int num = sc.nextInt();
                for (int i = 0; i < list.size(); i++) {
                    ArrayList<Integer> list2 = list.get(i);
                    for (int j = 0; j < list2.size(); j++) {
                        if (list2.get(j) == num) {
                            System.out.println("required details is:" + list2);
                            break;
                        }
                    }

                }
            case 3:
                System.out.print("enter the Deposite amount:");
                int amout_enter = sc.nextInt();
                for (int i = 0; i < list.size(); i++) {
                    ArrayList<Integer> list2 = list.get(i);
                    for (int j = 0; j < list2.size(); j++) {
                        // 3
                        int n = list2.get(3);
                        list2.remove(n);
                        n = n + amout_enter;
                        list2.add(n);

                    }

                }
            case 4:
                System.out.print("enter the withdrawal amount:");
                int amout_enter1 = sc.nextInt();
                for (int i = 0; i < list.size(); i++) {
                    ArrayList<Integer> list2 = list.get(i);
                    for (int j = 0; j < list2.size(); j++) {
                        // 3
                        int o = list2.get(3);
                        list2.remove(m);
                        o = o - amout_enter;
                        list2.add(o);
                    }
                }
            case 5:
                System.out.println("exit");

        }
    }

}

class banking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of customers do you wants:");
        int n = sc.nextInt();
        // int m = sc.nextInt();
        // System.out.println("*** Banking System Application*** ");
        // System.out.println("1. Display all account details:");
        // System.out.println("2. Search by account number ");
        // System.out.println("3. Deposite the amount");
        // System.out.println("5.Exit")
        bank b1 = new bank();
        b1.bankinfo(n);

    }

}
