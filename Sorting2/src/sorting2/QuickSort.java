package sorting2;
/**
 *
 * @author Kim Alfred
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        // partition the array around pivot
        int pivotIndex = partition(arr, low, high);

        // recursively sort the sub-arrays to the left and right of the pivot
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

private static int partition(int[] arr, int low, int high) {
    // choose pivot as the last element
    int pivot = arr[high];

    // index of smaller element
    int i = low - 1;

    for (int j = low; j < high; j++) {
        // if current element is smaller than or equal to pivot
        if (arr[j] <= pivot) {
            i++;

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // swap arr[i+1] and arr[high] (pivot element)
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return i+1;
}

}
