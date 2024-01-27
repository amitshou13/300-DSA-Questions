//find Kth smallest element from an given array
class KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        if (k > 0 && k <= arr.length) {
            return quicksort(arr, l, r, k - 1);
        } else {
            return -1; // Invalid input
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int quicksort(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int partitionIndex = partition(arr, low, high);

            if (partitionIndex == k) {
                return arr[partitionIndex];
            } else if (partitionIndex < k) {
                return quicksort(arr, partitionIndex + 1, high, k);
            } else {
                return quicksort(arr, low, partitionIndex - 1, k);
            }
        }
        return -1; // Should not reach here if k is valid
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;

        int result = kthSmallest(arr, 0,arr.length-1,k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}