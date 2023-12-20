import java.util.*;

class mergedsort2 {
    public static void conqure(int arr[], int si, int mid, int ei) {
        int merged[] = new merged[ei - si + 1];
        int id1 = si;
        int id2 = mid;
        int x = 0;
        while (id1 <= mid && id2 <= ei) {
            if (arr[id1] <= arr[id2]) {
                merged[x++] = merged[id1++];
            } else {
                merged[x++] = merged[id2++];
            }
        }
        while (id1 <= mid) {
            merged[x++] = merged[id1++];
        }
        while (id2 <= ei) {
            merged[x++] = merged[id2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei) {
        if (si <= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, ei);
        divide(arr, mid + 1, ei);
        conqure(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 1, 6, 4 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

}
