
//LInkedLIst through Scratch method
//Linear Linked List:
import java.util.*;

class LL {
    Node head;
    // for size:
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // Add first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;

    }

    // add last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // Add at any Required Location:
    public void addanyposition(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Position where You wants To Add The Data:");
        int n = sc.nextInt();
        for (int i = 1; i < n - 1; i++) {
            currNode = currNode.next;

        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    // Delete first:
    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void DeleteFirst() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is Empty:");
            return;
        }
        currNode = currNode.next;
        head = currNode;

    }

    // Delete Last:
    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        // Here we taking the two node beacuse we canot be trsversing in back:
        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // Deletion from any positon
    public void deleteanyposition() {
        if (head == null) {
            System.out.println("Linked List is Empty:");
            return;
        }
        System.out.println("Enter the Required Position:");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        Node currNode = head;
        Node ptr = currNode.next;
        for (int i = 1; i < p - 1; i++) {
            currNode = ptr;
            ptr = ptr.next;

        }
        currNode.next = ptr.next;

    }

    public void Reverseditreator() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevnode = head;
        Node CurrNode = head.next;
        while (CurrNode != null) {
            Node nextNode = CurrNode.next;
            CurrNode = prevnode;
            // update:
            prevnode = CurrNode;
            CurrNode = nextNode;
        }
        head.next = null;
        head = CurrNode;

    }

    // print
    public void printall() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        // int a = Sc.nextInt();
        System.out.println("Enter the Data:");
        do {
            list.addlast(sc.next());
            System.out.println("Do You want to Add More Data press 1:");
        } while (sc.nextInt() == 1);
        list.printall();
        System.out.println("Press 1 to Add Element In First Position" + "\t"
                + "press 2 to Add Element at Last Position:-" + "\t" + "press 3 to Add at any Required Position:-");
        int n = sc.nextInt();
        do {
            switch (n) {
                case 1:
                    list.addfirst(sc.next());
                    break;
                case 2:
                    list.addlast(sc.next());
                    break;
                case 3:
                    list.addanyposition(sc.next());
            }
            System.out.println("Do You want to Add More Data:, Press 1");
        } while (sc.nextInt() == 1);
        System.out.println("Required Data Is:-");
        list.printall();
        System.out.println("Press 1 for Deleting Element From the First Position:" + "\t"
                + "press 2 for Deleting the Elment from te Last position:"
                + "press 3 for Deleting the Elements from Any Position:");
        int a = sc.nextInt();
        do {
            switch (a) {
                case 1:
                    list.deletefirst();
                    break;
                case 2:
                    list.deletelast();
                    break;
                case 3:
                    list.deleteanyposition();
                    break;
            }
            System.out.println("Do You want to Delete  More Data:, Press 1");

        } while (sc.nextInt() == 1);
        list.printall();
        list.Reverseditreator();
        list.printall();

        System.out.println("Size of the Linked List:-" + list.getSize());
    }

}

class Node {
    int[] arr;
    char[] arr1;
    float[] arr2;
    Node next;

    Node(int[] arr, char[] arr1, float[] arr2, Node next) {
        arr = i;
        arr1 = c;
        arr2 = f;
        next = null;

    }
}

class LInkedadd {
    Node head;

    LInkedadd() {
        head = null;
    }

    public void Addingelement(int[] i, char[] c, float[] f) {
        Node newNode = new Node(i, c, f);
        if (head == null) {
            newNode = head;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    public void printAll() {
        Node currNode = head;
        while (currNode != null) {
            for (int i = 0; currNode.arr.length; i++) {
                System.out.println(currNode.arr[i] + "-");
            }
            for (int i = 0; currNode.arr1.length; i++) {
                System.out.println(currNode.arr1[i] + "--");
            }
            for (int i = 0; i < currNode.arr2.length; i++) {
                System.out.println(currNode.arr2[i] + "--");
            }
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        int[] arr = { 20, 34, 54 };
        char[] arr1 = { 'a', 'k', 'a', 's', 'h' };
        float[] arr2 = { 3.14f, 7.5f, 4.7f };
        LInkedadd d = new LInkedadd();
        d.Addingelement(arr, arr1, arr2);
        d.printAll();
    }
}

class LLL {
    Node head;

    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;

        }

    }

    // add last
    public void addlast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void addInt(int[] arr) {
        addlast(arr);
    }

    public void addchar(char[] arr1) {
        addlast(arr1);
    }

    public void addFloat(float[] arr2) {
        addlast(arr2);
    }

    public void PrintAllData() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        char[] arr1 = { 'a', 'k', 'a', 's', 'h' };
        float[] arr2 = { 2.34f, 4.56f, 46.f };
        LLL List = new LLL();
        List.addlast(arr);
        List.addlast(arr1);
        List.addlast(arr2);
        List.PrintAllData();

    }
}

class DoublyLInked {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    Node head = null;
    Node tail = null;

    public void creat() {
        int data, m, p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the Data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                System.out.println("Press 1 to add at first Positon" + "press 2 to add At last Position"
                        + "press 3 to add at any position:");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;
                    case 3:
                        System.out.println("Enter the Positon To be Inserted:");
                        p = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for (int i = 1; i < (p - 1); i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        new_node.prev = temp;
                        new_node.next = ptr;
                        temp.next = new_node;
                        ptr.prev = new_node;
                        break;

                }

            }
            System.out.println("press 1 for taking more Data:");

        } while (sc.nextInt() == 1);
    }

    public void deletedata() {
        int p, n, m;
        do {
            System.out.println("press 1 for deleting data from first position:"
                    + "press 2 for deleting data from the end position:"
                    + "press 3 for deleting data from the required Position:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n) {
                case 1:
                    Node temp = head;
                    temp = temp.next;
                    head = temp;
                    head.prev = null;
                    break;
                case 2:
                    Node temp1 = tail;
                    temp1 = temp1.prev;
                    temp1.next = null;
                    tail = temp1;
                    break;
                case 3:
                    System.out.println("Enter the Position:");
                    p = sc.nextInt();
                    Node temp2 = head;
                    Node ptr = temp2.next;
                    for (int i = 1; i < p - 1; i++) {
                        temp2 = ptr;
                        ptr = ptr.next;

                    }
                    temp2.next = ptr.next;
                    ptr.next.prev = temp2;
                    break;

            }
            System.out.println("Press 1 for preforming More Deletion Action:");
            m = sc.nextInt();
        } while (m == 1);
    }

    public void gatedata() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "-->");
            currnode = currnode.next;

        }
        System.out.println("tail");

    }

    public static void main(String args[]) {
        DoublyLInked de = new DoublyLInked();
        de.creat();
        de.deletedata();
        de.gatedata();
    }

}

class circularLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, n, p, m;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Data:");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;

            } else {

                System.out.println("Press 1 to Add Element In First Position" + "\t"
                        + "press 2 to Add Element at Last Position:-" + "\t"
                        + "press 3 to Add at any Required Position:-");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        newNode.next = head;
                        head = newNode;
                        tail.next = head;
                        break;
                    case 2:
                        tail.next = newNode;
                        tail = newNode;
                        newNode.next = head;
                        break;
                    case 3:
                        System.out.println("Enter the Position Where You want to Add gghe Data:");
                        p = sc.nextInt();
                        Node currNode1 = head;
                        for (int i = 1; i < (p - 1); i++) {
                            currNode1 = currNode1.next;
                        }
                        newNode.next = currNode1.next;
                        currNode1.next = newNode;
                        break;
                }

            }
            System.out.println("If You want to Add More Data press 1");
            n = sc.nextInt();
        } while (n == 1);

    }

    public void Deletionof() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("LL is Empty:");
            } else {
                System.out.println("Press 1 for Deleting from the First Postion"
                        + "Press 2 For Deleting Elements From the End Positon:"
                        + "Press 3 for Deleting Elements From The LAst Position:");
                m = sc.nextInt();
                switch (m) {
                    // deleting from the First Position:
                    case 1:
                        Node currNode = head;
                        currNode = currNode.next;
                        head = currNode;
                        tail.next = head;
                        break;
                    case 2:
                        // Deletion from The lAst Postion
                        Node CurrNode = head;
                        Node ptr = CurrNode.next;
                        while (ptr.next != head) {
                            CurrNode = ptr;
                            ptr = ptr.next;
                        }
                        CurrNode.next = head;
                        tail = CurrNode;
                    case 3:
                        Node currNode2 = head;
                        Node ptr1 = currNode2.next;
                        System.out.println("Enter the Positon from Where You Want to Delete The Data:");
                        p = sc.nextInt();
                        for (int i = 1; i < (p - 1); i++) {
                            currNode2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        currNode2.next = ptrl.next;

                }

            }
            System.out.println("If You want To Delete the Data Please Press 1:");

        } while (sc.nextInt() == 1);
    }

    public void trasversing() {
        Node currNode = head;
        if (head == null) {
            System.out.println("Linked List is Empty:");
        } else {
            do {
                System.out.print(currNode.data + "-->");
                currNode = currNode.next;
            } while (currNode != head);
            System.out.println("Tail");

        }
    }

    public static void main(String[] args) {
        circularLL LL = new circularLL();
        LL.creation();
        LL.trasversing();
        LL.Deletionof();

    }
}

class Postfixoperation {
    String sr;

}