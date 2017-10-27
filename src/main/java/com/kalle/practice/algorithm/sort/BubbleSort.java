package com.kalle.practice.algorithm.sort;

/**
 * 冒泡排序
 * Created by apple on 2017/10/25.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {49, 1, 232, 111, 3, 32};
        int[] result = bubbleSort(input);

        for (int i = 0; i < result.length; i ++) {
            System.out.println(result[i]);
        }
    }

    private static int[] bubbleSort(int[] input) {
        for (int i = 0; i < input.length; i ++) {
            for (int j = 0; j < input.length - i - 1; j ++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        return input;
    }
}
