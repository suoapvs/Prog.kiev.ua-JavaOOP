package com.yurii.salimov.lesson07.task03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Matrix extends Thread {

    private final int[][] matrixA;
    private final int[][] matrixB;
    private final int[][] matrixC;
    private final int size;

    public Matrix(final int size, final int rand) {
        this.size = size;
        this.matrixA = randomMatrix(size, rand);
        this.matrixB = randomMatrix(size, rand);
        this.matrixC = new int[size][size];
    }

    public Matrix(final int[][] matrixA, final int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.size = matrixA.length;
        this.matrixC = new int[this.size][this.size];
    }

    public void showAllMatrix() {
        System.out.print("Matrix A:\n");
        showMatrix(this.matrixA);
        System.out.print("\nMatrix B:\n");
        showMatrix(this.matrixB);
        System.out.print("\nMatrix C:\n");
        showMatrix(this.matrixC);
    }

    public void calculation(final int i, final int j) {
        this.matrixC[i][j] = 0;
        for (int k = 0; k < this.size; k++) {
            this.matrixC[i][j] += this.matrixA[i][k] * this.matrixA[k][j];
        }
    }

    public int[][] getMatrixA() {
        return this.matrixA;
    }

    public int[][] getMatrixB() {
        return this.matrixB;
    }

    public int[][] getMatrixC() {
        return this.matrixC;
    }

    public int getSize() {
        return this.size;
    }

    public static int[][] randomMatrix(int matrixSize, int rand) {
        final int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int) (Math.random() * rand);
            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
