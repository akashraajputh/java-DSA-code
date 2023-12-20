import java.util.Scanner;

//import javax.swing.plaf.synth.SynthScrollBarUI;

class sum_element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rows:");
        int r = sc.nextInt();
        System.out.println("enter the length of col:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        // input
        System.out.println("enter the element:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        // output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i != j || j != (c - i - 1)) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("required sum is:" + sum);
    }

}
