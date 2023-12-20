import java.util.LinkedList;
import java.util.*;
/* BInary Tree is a tree where Every Node must have atmost 2 NODE(Childeren Node)
 *   (a)(ROOT NODE)
 *   /  \
 *  null null
 * Type
 * 1. full Binary Tree/Strictly :- Each ANd every Node Must have two Childeren Node Except The Leaf Node
 *      (A)
 *      /  \
 *     (B) (C)
 *     / \   / \
 *    (E) (f)
 * 2. ALmost Complete/incomplete Binary Tree:- where Each Node must have Two Childeren Node At all Levels
 * excepet the Last level(But it should be filled Left to Right)
 *      (A)
 *      /  \
 *     (B) (C)
 *     / \   / \
 *    (E) (f)(m) (n)
 *    /  \
 *    (h) (i)
 * 3. Complete BInary Tree/perfect Binary Tree:-where Every Node have Must two Childeren Node.In Each level 2^n level of Node (n:--> Level;)
 *       (A)
 *      /  \
 *     (B) (C)
 *     / \   / \
 *    (E) (f)(m) (n)
 * Note:- Root Node(2i), left(2i+1),Right(2i+2)
 * 
 *   */
import java.util.*;

// Java program for Inserting a node 
class BinarySearch {

    // Given Node
    static class node {
        int key;
        node left, right;
    };

    // Function to create a new BST node
    static node newNode(int item) {
        node temp = new node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to insert a new node with
    // given key in BST
    static node insert(node node, int key) {
        // If the tree is empty, return a new node
        if (node == null)
            return newNode(key);

        // Otherwise, recur down the tree
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        // Return the node
        return node;
    }

    // Function to do inorder traversal of BST
    static void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(" " + root.key);
            inorder(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Let us create following BST
         * 50
         * / \
         * 30 70
         * / \ / \
         * 20 40 60 80
         */
        node root = null;
        System.out.println("Enter the Root Node:");
        root = insert(root, sc.nextInt());
        do {
            System.out.println("Enter the Value Of The Chid Node");
            insert(root, sc.nextInt());

        } while (sc.nextInt() == 1);
        System.out.println("Required OutPut iS:");
        inorder(root);
    }
}

class Searchh {
    static int searching(int x, int arr[]) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int max = (l + r) / 2;
            if (x == arr[max]) {
                return (max + 1);

            }
            if (x > arr[max]) {
                l = max + 1;
            } else {
                r = max - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data Which You Want to Search:");
        int x = sc.nextInt();
        int n = searching(x, arr);
        if (n == -1) {
            System.out.println("Element is not Found:");
        } else {
            System.out.println("Element found at the Position:" + n);
        }
    }
}

class LienarSeacrch {
    static int linear(int x, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Element found at the location:-");
                return (i + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element Which You want to Search:");
        int x = sc.nextInt();
        int arr[] = { 5, 2, 4, 5, 8, 9, 12 };
        int m = linear(x, arr);
        System.out.println(m);
        if (m >= 0) {
            System.out.println(m);
        } else {
            System.out.println("Element is not Found:");
        }
    }
}

class SearchAlgorithms {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Binary Search (assuming the array is sorted)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target1 = 23;
        int target2 = 38;

        // Performing Linear Search
        int linearResult1 = linearSearch(arr, target1);
        int linearResult2 = linearSearch(arr, target2);

        System.out.println("Linear Search:");
        System.out.println("Index of " + target1 + " is: " + linearResult1);
        System.out.println("Index of " + target2 + " is: " + linearResult2);

        // Performing Binary Search
        int binaryResult1 = binarySearch(arr, target1);
        int binaryResult2 = binarySearch(arr, target2);

        System.out.println("\nBinary Search:");
        System.out.println("Index of " + target1 + " is: " + binaryResult1);
        System.out.println("Index of " + target2 + " is: " + binaryResult2);
    }
}

class BasicHashTable {

    private LinkedList<String>[] hashTable;
    private int capacity;

    // Constructor to initialize the hash table
    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        hashTable = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    // Hash function - simple modulo arithmetic
    private int hashFunction(String key) {
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    // Insert method to add elements to the hash table
    public void insert(String key, String value) {
        int index = hashFunction(key);

        hashTable[index + 2].add(value);
    }

    // Method to retrieve value associated with a key
    public String get(String key) {
        int index = hashFunction(key);
        LinkedList<String> list = hashTable[index];
        for (String value : list) {
            // Assuming keys are not stored separately
            return value; // Return the first value found for the given key
        }
        return null; // Return null if key not found
    }

    public static void main(String[] args) {
        BasicHashTable hashTable = new BasicHashTable(10);

        // Inserting elements into the hash table
        hashTable.insert("Apple", "A");
        hashTable.insert("Banana", "B");
        hashTable.insert("Orange", "C");
        hashTable.insert("Grapes", "D");

        // Retrieving elements
        System.out.println("Value for key 'Apple': " + hashTable.get("Apple"));
        System.out.println("Value for key 'Banana': " + hashTable.get("Banana"));
        System.out.println("Value for key 'Orange': " + hashTable.get("Orange"));
        System.out.println("Value for key 'Grapes': " + hashTable.get("Grapes"));
        System.out.println("Value for key 'Watermelon': " + hashTable.get("Watermelon"));
    }
}

class HashEntry {
    private int key;
    private String value;

    public HashEntry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

class BasicHashTable2 {
    private int capacity;
    private HashEntry[] table;

    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        table = new HashEntry[capacity];
    }

    private int hashFunction(int key) {
        return key % capacity;
    }

    public void insert(int key, String value) {
        int hash = hashFunction(key);

        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % capacity;
        }

        table[hash] = new HashEntry(key, value);
    }

    public String get(int key) {
        int hash = hashFunction(key);

        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % capacity;
        }

        if (table[hash] == null) {
            return null; // Key not found
        } else {
            return table[hash].getValue();
        }
    }

    public static void main(String[] args) {
        BasicHashTable hashTable = new BasicHashTable(10);

        hashTable.insert(5, "Apple");
        hashTable.insert(12, "Banana");
        hashTable.insert(25, "Orange");
        hashTable.insert(7, "Grapes");

        System.out.println("Value for key 5: " + hashTable.get(5));
        System.out.println("Value for key 12: " + hashTable.get(12));
        System.out.println("Value for key 25: " + hashTable.get(25));
        System.out.println("Value for key 7: " + hashTable.get(7));
    }
}
// Java program to create HashMap from an array
// by taking the elements as Keys and
// the frequencies as the Values

class Hashing {

    // Function to create HashMap from array
    static void createHashMap(int arr[]) {
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {

            // Get if the element is present
            Integer c = hmap.get(arr[i]);

            // If this is first occurrence of element
            // Insert the element
            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            }

            // If elements already exists in hash map
            // Increment the count of element by 1
            else {
                hmap.put(arr[i], ++c);
            }
        }

        // Print HashMap
        System.out.println(hmap);
    }

    // Driver method to test above method
    public static void main(String[] args) {
        int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
        createHashMap(arr);
    }
}
