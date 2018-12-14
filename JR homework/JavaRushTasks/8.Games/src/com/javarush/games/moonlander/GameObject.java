package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;


public class GameObject {
    public double x, y;
    public int[][] matrix;

    public int width, height;

    public GameObject(double x, double y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;

        width = matrix[0].length;
        height = matrix.length;
    }

    public void draw(Game g) {
        if (matrix == null) return;

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                g.setCellColor(i+(int)x, j+(int)y, Color.values()[matrix[j][i]]);
            }
        }

    }
}
