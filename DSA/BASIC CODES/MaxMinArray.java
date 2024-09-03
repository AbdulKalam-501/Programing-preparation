public class MaxMinArray {
    public static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6, 4};
        findMaxMin(arr);
    }
}