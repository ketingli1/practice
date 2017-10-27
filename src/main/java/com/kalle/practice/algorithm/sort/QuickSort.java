package com.kalle.practice.algorithm.sort;

/**
 * Created by apple on 2017/10/25.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] input = {49, 1, 232, 111, 3, 32};
        int[] result = quickSort(input, 0, input.length - 1);

        for (int i = 0; i < result.length; i ++) {
            System.out.println(result[i]);
        }
    }

    private static int[] quickSort(int[] input, int low, int high) {
        if (low > high) {
            return input;
        }

        int i = low, j = high;
        int flag = input[i];

        while (i != j) {
            while (flag < input[j] && i < j) {
                j --;
            }

            while (flag > input[i] && i < j) {
                i ++;
            }

            if (i < j) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        input[i] = flag;

        quickSort(input, low, i - 1);
        quickSort(input, i + 1, high);

        return input;
    }
}
