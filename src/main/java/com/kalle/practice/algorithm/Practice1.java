package com.kalle.practice.algorithm;

/**
 * 十进制转任意进制
 * Created by apple on 2017/10/25.
 */
public class Practice1 {

    public static void main(String[] args) {
        System.out.println(test(16, 8));
    }

    private static String test(int origin, int hex) {
        StringBuilder sb = new StringBuilder();

        while (true) {
            int result = origin % hex;
            sb.append(result);
            origin = origin / hex;

            if (origin <= 0) {
                break;
            }
        }

        return sb.toString();
    }
}
