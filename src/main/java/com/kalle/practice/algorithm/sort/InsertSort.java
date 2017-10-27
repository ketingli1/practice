package com.kalle.practice.algorithm.sort;

/**
 * 插入排序
 * Created by apple on 2017/10/25.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] input = {49, 1, 232, 111, 3, 32};
        int[] result = insertSort(input);

        for (int i = 0; i < result.length; i ++) {
            System.out.println(result[i]);
        }
    }

    private static int[] insertSort(int[] input) {
        for (int i = 1; i < input.length; i ++) {
            int j = i;
            int target = input[i];

            while (j > 0 && target < input[j - 1]) {
                input[j] = input[j - 1];
                j --;
            }

            input[j] = target;
        }

        return input;
    }
}
