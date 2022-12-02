package lesson2;

//733. Flood Fill

import java.util.Arrays;

public class TaskTwo {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] res = floodFill(image, sr, sc, color);
        System.out.print(Arrays.deepToString(res));
    }


    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        if (color != initialColor) {
            dfs(image, sr, sc, color, initialColor);
        }
        return image;
    }

    static void dfs(int[][] image, int i, int j, int color, int initialColor) {
        if (image[i][j] == initialColor) {
            image[i][j] = color;
            if (i >= 1) {
                dfs(image, i - 1, j, color, initialColor);
            }
            if (j >= 1) {
                dfs(image, i, j - 1, color, initialColor);
            }
            if (i + 1 < image.length) {
                dfs(image, i + 1, j, color, initialColor);
            }
            if (j + 1 < image[0].length) {
                dfs(image, i, j + 1, color, initialColor);
            }
        }
    }
}

