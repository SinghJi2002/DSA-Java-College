public class A_MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        
        mergeSort(left);
        mergeSort(right);

        
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Add any remaining elements from the left and right halves.
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};

        // Sort the array in ascending order.
        A_MergeSort.mergeSort(array);

        // Print the sorted array.
        for (int element : array) {
            System.out.println(element);
        }

    }
}
