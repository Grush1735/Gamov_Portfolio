package oop_first;

import java.util.Arrays;

public class Matrix {

    int x = 2;
    int y = 5;
    int[][] TDA1 = new int[][]{{1,2}, {2,3}, {3, 4}, {4, 5}, {5, 6}};
    int[][] TDA2 = new int[][]{{1,1}, {2,2}, {3, 3}, {4, 4}, {5, 5}};

    public static int[][] MatrixSum(int[][] TDA1, int[][] TDA2) {
        int[][] sum = new int[TDA1.length][TDA1[0].length];
        for (int i = 0; i < TDA1.length; i++){
            for (int j = 0; j < TDA1[i].length; j++){
                sum[i][j] = TDA1[i][j] + TDA2[i][j];
            }
        }
        return sum;
    }

    public static int[][] MatrixToNumMultiplication(int[][] TDA1, int b) {
        int[][] Multiplication = new int[TDA1.length][TDA1[0].length];
        for (int i = 0; i < TDA1.length; i++){
            for (int j = 0; j < TDA1[i].length; j++){
                Multiplication[i][j] = TDA1[i][j] * b;
            }
        }
        return Multiplication;
    }

    void MatrixPrint(int[][] ArrayToPrint){
        System.out.print(Arrays.deepToString(ArrayToPrint) + "\n");
    }

    public static int[][] MatricesMultiplication(int[][] TDA1, int[][] TDA2) {
        int[][] Multiplication = new int[TDA1.length][TDA1[0].length];
        for (int i = 0; i < TDA1.length; i++){
            for (int j = 0; j < TDA1[i].length; j++){
                Multiplication[i][j] = TDA1[i][j] * TDA2[i][j];
            }
        }
        return Multiplication;
    }





    public static void main(String[] args){
        int[][] TDA1 = new int[][]{{1,2}, {2,3}, {3, 4}, {4, 5}, {5, 6}};
        int[][] TDA2 = new int[][]{{1,1}, {2,2}, {3, 3}, {4, 4}, {5, 5}};
        Matrix Matrix1 = new Matrix();
        Matrix1.MatrixPrint(MatrixToNumMultiplication(TDA2, 2));
        Matrix1.MatrixPrint(MatrixSum(TDA1, TDA2));
        Matrix1.MatrixPrint(MatricesMultiplication(TDA1, TDA2));
    }
}


