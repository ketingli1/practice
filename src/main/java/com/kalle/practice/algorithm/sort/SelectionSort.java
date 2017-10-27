package com.kalle.practice.algorithm.sort;

/**
 * 选择排序
 * Created by apple on 2017/10/25.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] input = {49, 1, 232, 111, 3, 32};
        int[] result = selectionSort(input);

        for (int i = 0; i < result.length; i ++) {
            System.out.println(result[i]);
        }
    }

    private static int[] selectionSort(int[] input) {
        for (int i = 0; i < input.length; i ++) {
            int k = i;

            for (int j = i + 1; j < input.length; j ++) {
                if (input[j] <= input[k]) {
                    k = j;
                }
            }

            if (k != i) {
                int temp = input[k];
                input[k] = input[i];
                input[i] = temp;
            }
        }

        return input;
    }
}
