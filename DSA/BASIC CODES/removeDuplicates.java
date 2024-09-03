import java.util.Arrays;

public class removeDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        int[] uniqueArr = new int[j + 1];
        System.arraycopy(arr, 0, uniqueArr, 0, j + 1);
        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}