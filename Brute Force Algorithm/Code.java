public class BruteForceSearch {
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Return the index if the target is found in the given array
            }
        }
        return -1;  // Return -1 if the target is not found in the given array
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 9, 7, 1, 6};
        int target = 7;
        int index = search(array, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
