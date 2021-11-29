package com.company;

import java.util.Arrays;

public class Matrix {

    public void print(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public void swapColumns(int[][] matrix, int num1, int num2) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][num1];
            matrix[i][num1] = matrix[i][num2];
            matrix[i][num2] = temp;
        }
    }

    public void swapRows(int[][] matrix, int row1, int row2) {
        int[] newArr = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = newArr;
    }

    public void mul(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] *= value;
            }
        }
    }

    public int[] toArray(int[][] matrix) {
        int[] arr = new int[matrix.length * matrix[0].length];
        int k = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[k] += ints[j];
                k++;
            }
        }
        return arr;
    }

    public int max(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        return max;
    }


}
