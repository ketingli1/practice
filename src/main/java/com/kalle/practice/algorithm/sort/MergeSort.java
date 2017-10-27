package com.kalle.practice.algorithm.sort;

/**
 * Created by apple on 2017/10/27.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] input1 = {1, 3, 5, 7, 10};
        int[] input2 = {2, 4, 6, 8, 9, 10};

        int[] result = mergeSort(input1, input2);
        for (int i = 0; i < result.length; i ++) {
            System.out.println(result[i]);
        }
    }

    private static int[] mergeSort(int[] input1, int[] input2) {
        int result[] = new int[input1.length + input2.length];

        int i = 0, j = 0, k = 0;
        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                result[k] = input1[i];
                i ++;
            } else {
                result[k] = input2[j];
                j ++;
            }

            k ++;
        }

        while (i < input1.length) {
            result[k] = input1[i];
            i ++;
            k ++;
        }

        while (j < input2.length) {
            result[k] = input1[j];
            j ++;
            k ++;
        }

        return result;
    }
}
