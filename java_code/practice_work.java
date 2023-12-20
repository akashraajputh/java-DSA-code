import java.util.*;
import java.util.Stack;

class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        int b = a;
        int sum = 0;
        while (a != 0) {
            int rem = a % 10;
            sum = sum * 10 + rem;
            a = a / 10;

        }
        if (sum == b) {
            System.out.println("Number Is AlamStrong:");
        } else {
            System.out.println("Number is Not a AlamStrong:");
        }
        System.out.println("Swaped Number Is:" + sum);
    }
}

class Duplicate {
    public static boolean duplicatenum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (j > i) {
                    if (arr[j] == num) {
                        sum += 1;
                    }
                }
            }

        }
        if (sum >= 1) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the arrays:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element of the Arrays:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicatenum(arr));

    }
}

class Duplicate2 {
    public static boolean duplicatenum2(int arr[]) {
        // int elem = 0;
        int elm2 = 0;

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];

            for (int j = 1; j < arr.length; j++) {
                if (elem == arr[j]) {
                    elm2 += 1;
                }
            }

        }
        if (elm2 >= 1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Arrays:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicatenum2(arr));
    }
}

// sorting Technique code
// 1.Bubble sort:
class Bubblesort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}

class Selectionsort {

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}

class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 3 };
        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            // Updating the value of j on the basis of the Interation:
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement of the Current Data at the j+1 postion of the Element:
            arr[j + 1] = current;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

// Code for finding the Permutation of the string:
class ReCurssion {
    public static void permutation(String str, String newstring) {
        ArrayList<String> arr = new ArrayList<>();
        if (str.length() == 0) {
            System.out.println(newstring);
            arr.add(newstring);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentchr = str.charAt(i);
            String news = str.substring(0, i) + str.substring(i + 1);
            permutation(news, newstring + currentchr);
        }
    }

    void totalpermutation(String str) {
        int sum = 1;
        for (int i = 0; i < str.length(); i++) {
            sum *= 2;
        }
        System.out.println("Total permutation is:" + sum);
    }

    public static void main(String[] args) {
        permutation("abc", " ");
        ReCurssion a = new ReCurssion();
        a.totalpermutation("abc");

    }
}

class Strm {
    public static void strmnu(String str, int idx) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("Reversing String Is:" + str1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");

        String str = sc.next();
        strmnu(str, str.length());

    }
}

class Down {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of the Rows:");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

}

class down2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println("0".repeat(i));
            } else {
                System.out.println("*".repeat(i));
            }
        }
    }
}

// {1,2,3,4},return false
// {1,1,2,3,3,4,5} return True
class Pathcount {
    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }
        // move Downward
        int downward = countPath(i + 1, j, n, m);
        // move Right
        int right = countPath(i, j + 1, n, m);
        return (downward + right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rows:");
        int n = sc.nextInt();
        System.out.println("Enter the Length of the Column");
        int m = sc.nextInt();
        // Note:initially We take positon is (0,0):
        System.out.println("Total path through maze travel:" + countPath(0, 0, n, m));

    }
}

class Arrduplicate {
    public static ArrayList<Integer> arrnum(int[] arr) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ar.add(arr[i]);
        }
        for (int j = 0; j < ar.size() - 1; j++) {
            if (ar.get(j) == ar.get(j + 1)) {
                ar.remove(j + 1);
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Arrays");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element of the Arrays:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arrnum(arr));
    }

}

// Finding the factorial of the number Using recur.. Method:
class Factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;

        } else {

            return (n * fact(n - 1));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Factorial of a number iS:" + fact(n));
    }
}

// Tranpose of a Matrice:
class Transpose {
    public static void trans(int arr1[][], int arr2[][]) {
        System.out.println("Transpose of a Matrice is:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j] = arr1[j][i];
                System.out.println(arr2[i][j] + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Rows");
        int row = sc.nextInt();
        System.out.println("Enter the Length of The Column");
        int col = sc.nextInt();
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        System.out.println("Enter the Element of a Matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        trans(arr1, arr2);
    }
}

class Fibo {
    public static int Fibonasis(int n) {
        if (n <= 1) {
            return n;
        }

        return (Fibonasis(n - 1) + Fibonasis(n - 2));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Fibonasis of a Number iS: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(Fibonasis(i));

        }

    }
}

// matries Multiplication:
class MatriesMultiply {
    public static void Matries(int arr1[][], int arr2[][]) {
        int num[][] = new int[arr1.length][arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                // num[i][j] = 0;
                for (int k = 0; k < num.length; k++) {
                    num[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Rows");
        int row = sc.nextInt();
        System.out.println("Enter the Length of The Column");
        int col = sc.nextInt();
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        System.out.println("Enter the Element of The ARR1");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Element of The ARR2");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        Matries(arr1, arr2);

    }
}

class Leng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber:");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += 1;
            n = n / 10;

        }
        System.out.println("Length of the Number iS:" + sum);
    }
}

// sum of the Fibonasis Serires Through Normal Method:
class Fibona {
    public static void Fibom(int n) {
        int num1 = 0;
        int num2 = 1;
        int n1 = 0;
        while (n1 < n) {
            System.out.println(n1);
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            n1++;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        Fibom(n);

    }
}

class Addingconcept {
    public static LinkedList addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> l3 = new LinkedList<>();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < l1.size(); i++) {
            s1.setCharAt(0, Integer.tochar(l1.get((l1.size() - (i + 1)))));

        }
        for (int i = 0; i < l2.size(); i++) {
            s2.setCharAt(0, Integer.tochar(l2.get((l2.size() - (i + 1)))));

        }
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.pargseInt(s2);
        int n3 = n1 + n2;
        while (n3 != 0) {
            l3.add(n3 % 10);
            n3 = n3 / 10;
        }
        return L3;

    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(4);
        l1.add(3);
        l1.add(2);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(7);
        System.out.println(addTwoNumbers(l1, l2));
        ;
    }
}

class Largest {
    int arr[] = { 3, 1, 54, 7, 94, 3, 2, 32, 32, 94, 105 };

    public void largestNO() {
        int larg = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > larg) {
                larg = arr[i + 1];
            }
        }
        System.out.println("Largest Number Inside the Arrays iS:-->" + larg);
    }

    public static void main(String[] args) {
        Largest l1 = new Largest();
        l1.largestNO();

    }
}

class Largest1 {
    static int arr[] = { 3, 1, 54, 7, 94, 3, 2, 32, 32, 94, 105 };

    static class arr {
        arr head;
        arr next;
        arr tail;

        arr() {
            head = arr[0];
            next = head.next;
            tail = head;
        }

        public void largestNO1() {
            int larg = head;
            for (int i = 0; i < arr.length - 1; i++) {
                tail = (arr.length - 1);
                if (arr[i + 1] > larg) {
                    larg = arr[i + 1];
                }

            }

            System.out.println("Largest Number Inside the Arrays iS:-->" + larg);
        }
    }

    public static void main(String[] args) {
        Largest1 l1 = new Largest1();
        l1.largestNO1();

    }
}

class LTrainproblem {
    Node head;

    class Node {
        String[] data;
        Node next;

        Node(String data[]) {
            this.data = data;
            this.next = null;
        }

    }

    // add last
    public void addlast(String data[]) {
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

    // print
    public void printall() {
        Node currNode = head;
        while (currNode != null) {
            for (int i = 0; i < currNode.data.length; i++) {
                System.out.print(currNode.data[i] + "-->");

            }

            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LTrainproblem list = new LTrainproblem();
        String arr[] = new String[5];
        do {
            System.out.println("Enter the 1 for Adding Initial Data 20  Compartment"
                    + "press 2 for Deleting data from any required Position:"
                    + "Press 3 for Adding any Data at The Last Compartment:");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Enter the Data at the " + (i + 1) + "Compartment:");
                        for (int j = 0; j < 5; j++) {
                            arr[j] = sc.next();
                        }
                        list.addlast(arr);

                    }
                    list.printall();
                    break;
                case 2:
                    list.deleteanyposition();
                    list.printall();
                    break;
                case 3:
                    for (int j = 0; j < 60; j++) {
                        arr[j] = sc.next();
                    }
                    list.addlast(arr);
                    list.printall();
                    break;

            }
            System.out.println("Please press 1 for Doing again operartion:");

        } while (sc.nextInt() == 1);
        list.printall();

    }

}

class PostfixEvaluator {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;

                switch (c) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "34+2*"; // Example postfix expression

        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result of postfix expression evaluation: " + result);
    }
}
// Java program for finding the Postfix Expression:

class PostfixEvaluation {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to integer and push to stack
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;
                switch (c) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                }
                stack.push(result); // Push the result back to the stack
            }
        }

        return stack.pop(); // Return the final result
    }

    public static void main(String[] args) {
        String postfixExpression = "82+3-"; // Replace this with your postfix expression
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result of " + postfixExpression + " is " + result);
    }
}
// java cod e for finding largest element Second Largest Element, Samallest and
// Second Smallest Elements:

class Largestelement {
    static void ElementFindout(int arr[]) {
        //int largest = Integer.MAX_VALUE;
        //int smallest = Interger.MIN_VALUE;
        int largest = arr[0];
        int secondlargest = arr[0];
        int smallest = arr[0];
        int secondsmallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] >= secondlargest && arr[i] != largest) {
                secondlargest = arr[i];

            }

            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] <= secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }
        System.out.println("Largest:-" + largest);
        System.out.println("Second Largest is:-" + secondlargest);
        System.out.println("Smallest:-" + smallest);
        System.out.println("Second Smallest is:-" + secondsmallest);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 12, 1, 56, 8, 9 };
        ElementFindout(arr);
    }
}