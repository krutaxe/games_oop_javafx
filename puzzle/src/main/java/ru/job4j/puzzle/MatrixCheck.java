package ru.job4j.puzzle;

public class MatrixCheck {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board[column].length; row++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}