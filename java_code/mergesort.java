import java.util.Scanner;
//based on the concept of divide and conqure:
//import java.util.*;
//In the terms of the space complexity.. Bubblesort is the better technique as Compare to another one:

class Mergesort {

    public static void conqure(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    // dividing list into two parts
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // first part
        divide(arr, si, mid);
        // second part
        divide(arr, mid + 1, ei);
        // calling conqure function
        conqure(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the arrays:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("enter the element of the arrays:");
        for (int i = 0; i < a; i++) {
            // int b = sc.nextInt();
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.println("unsorted arrays is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        divide(arr, 0, n - 1);
        // output
        System.out.println("\n" + "sorted arrays is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("Required Sorted Arrys is Completed then we Exit:");

    }
}
