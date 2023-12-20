import java.util.*;

//based on pivot and partion
class quick_sort {
    public static int partion(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partion(arr, low, high);
            quicksort(arr, low, pidx - 1);
            quicksort(arr, pidx + 1, high);
        }

    }

    public static void main(String args[]) {
        // int arr[] = { 2, 4, 1, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the arrays:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        int n = arr.length;
        System.out.println("enter the element of the arrays:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("unsorted arrays is:");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        quicksort(arr, 0, n - 1);
        System.out.println("\n" + "sorted arrays is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "coding is done by Akash Singh Rajput");
    }

}
