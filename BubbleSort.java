public class BubbleSort {

    public static void BubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] theArray = {21, 59, 64, 99, 72, 31, 43, 76, 10};

        System.out.print("Original Array: ");
        for (int num : theArray) {
            System.out.print(num + ", ");
        }

        BubbleSort(theArray);

        System.out.print("\nSorted Array: ");
        for (int num : theArray) {
            System.out.print(num + ", ");
        }
    }
}