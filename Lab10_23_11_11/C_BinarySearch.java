public class C_BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 7;

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("The target element is found at index " + index);
        } else {
            System.out.println("The target element is not found in the array");
        }
    }
}
