package lesson4;
//542. 01 Matrix

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TaskOne {
    static final int MATRIX = Integer.MAX_VALUE;
    static final int CELL = 0;

    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> q = new LinkedList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == CELL) {
                    q.offer(new int[]{row, col});
                } else {
                    matrix[row][col] = MATRIX;
                }
            }
        }
        while (!q.isEmpty()) {
            int[] curPoint = q.poll();
            int curRow = curPoint[0];
            int curCol = curPoint[1];
            for (int[] direction : DIRECTIONS) {
                int newRow = curRow + direction[0];
                int newCol = curCol + direction[1];
                if (newRow < 0 || newCol < 0 || newRow >= matrix.length ||
                        newCol >= matrix[0].length ||
                        matrix[newRow][newCol] + 1 >= matrix[curRow][curCol]) {
                    continue;
                }
                matrix[newRow][newCol] = matrix[curRow][curCol] + 1;
                q.add(new int[]{newRow, newCol});

            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrixIn = new int[][]{{0, 1, 1}, {0, 1, 0}, {1, 1, 1}};
        System.out.print(Arrays.deepToString(updateMatrix(matrixIn)));
    }

}


