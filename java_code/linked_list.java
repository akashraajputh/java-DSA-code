// scratch in linked list important for begineer::

*list.printList();*/System.out.println(list.getsize());

// list.deleteFirst();
list.printList();

// list.addfirst("name");
System.out.println(list.getsize());
// list.reveriterate();
// list.printList();
list.head=list.reversrecurssive(list.head);list.addfirst("Name: ");list.printList();

}import java.util.List;

}Node newHead=reversrecurssive(head.next);head.next.next=head;head.next=null;return newHead;}

public static void main(String args[]){LL list=new LL();Scanner sc=new Scanner(System.in);System.out.println("enter the number how  many element U want's to add:");int len=sc.nextInt();System.out.println("enter the element:");

for(int i=0;i<len;i++){String a=sc.next();list.addfirst(a);

}/*
         * list.addfirst("singh");
         * list.printList();
         * 
         * list.addLast("rajput");
         * list.printList();

}

class linked_list {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the linked List:");
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("enter the element:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.addFirst(element);
        }
        System.out.println(list);
        list.addLast(45);
        System.out.println(list);
    }
}

// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2,
// 3).
// Search for the number 7 & display its index.
class linked_list2 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 7) {
                System.out.println("index of 7 is:" + i);
            }
        }
    }
}

// Take elements(numbers in the range of 1-50) of a Linked List as input
// from the user. Delete all nodes which have values greater than 25.
class linked_list3 {
    public static void main(String args[]) {
        System.out.println("enter the length of linked list:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("enter the element in the range of 1 to 50:");
        for (int i = 0; i < len; i++) {
            int element = sc.nextInt();
            if (element > 50) {
                System.out.println("element is out of range:");
                break;
            }
            if (element <= 50 || element >= 1) {
                list.add(element);
            }
        }
        System.out.println(list);
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (list.get(i) < 25) {
                list1.add(list.get(i));
            }
        }
        System.out.println("list after the remvoing element is:" + list1);import java.util.*;

class LL {
    Node head;
    // for size
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

    // add - first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        // newnode pointing toward head and head become new head
        newNode.next = head;
        head = newNode;

    }

    // add last:
    public void addLast(String data) {
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

    // print
    public void printList() {
        // agar null hua to
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    // delete first;
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty:");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last;
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {// head.next = null -> lastNode
            lastNode = lastNode.next;// null.next
            secondlast = secondlast.next;
        }
        secondlast.next = null;

    }

    public int getsize() {
        return size;
    }
    // for reversing by using iteration method:

    public void reveriterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    // reversing linked list by using the concept of recurssion:
    public Node reversrecurssive(Node head) {
        if (head == null || head.next == null) {
            return head;
    }
}

class NewLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    }

    public static void main(String agrs[]) {
        NewLL list_lm = new NewLL();
        list_lm.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        // linking the node
        list_lm.head.next = second;
        second.next = third;
        list_lm.printList();
    }
}

