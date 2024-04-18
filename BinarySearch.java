public class BinarySearch {

    public static int BinarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] thisArray = {10, 21, 31, 43, 59, 64, 72, 76, 99};
        int target = 31;

        System.out.print("Sorted Array: ");
        for (int num : thisArray) {
            System.out.print(num + ", ");
        }

        int result = BinarySearch(thisArray, target);

        if(result != -1) {
            System.out.print("\nTarget " + target + "found at index: " + result);
        } else {
            System.out.print("\nTarget " + target + " not found in the array.");
        }
    }
}