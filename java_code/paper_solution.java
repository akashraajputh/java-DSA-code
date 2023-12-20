import java.util.*;

class Datainput {
    void Sum(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr1.length][arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        System.out.println("Required Values After Sum is:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr3[i][j] + " ");

            }
        }

    }
}

class DataSub {
    void Subtract(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = arr1[i][j] - arr2[i][j];

            }
        }
        System.out.print("Required Value After Substraction is:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");

            }
        }

    }
}

class DisplayData {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the rows:");
        int m = sc.nextInt();
        ;
        System.out.println("enter the number of the column:");
        int n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        System.out.println("enter the element of the First Arrays:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }

        }
        int[][] arr2 = new int[m][n];
        System.out.println("enter the element of the Second Arrays:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }
        Datainput d1 = new Datainput();
        DataSub d2 = new DataSub();
        d1.Sum(arr1, arr2);
        d2.Subtract(arr1, arr2);
    }
}
