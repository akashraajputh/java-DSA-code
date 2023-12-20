
//product of two d arrays
import java.util.*;

import javax.xml.transform.stream.StreamSource;

class sum_2D_arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the langth of rows: ");
        int r = sc.nextInt();
        System.out.print("enter the length of column: ");
        int c = sc.nextInt();
        System.out.println("for 1st Arrays Enter the element: ");
        int array1[][] = new int[r][c];
        int array2[][] = new int[r][c];
        // input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array1[i][j] = sc.nextInt();

            }
        }
        System.out.println("for 2nd arrays Enter the element: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array2[i][j] = sc.nextInt();

            }
        }
        // sum
        int sum[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = array1[i][j] * array2[i][j];
            }
        }
        System.out.println("requrired multiple of two matrices is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
        }

    }

}
