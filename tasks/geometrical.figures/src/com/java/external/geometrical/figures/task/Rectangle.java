package com.java.external.geometrical.figures.task;

public class Rectangle {

    private int width;
    private int height;
    private final int DEFAULT_WIDTH = 3;
    private final int DEFAULT_HEIGHT = 15;
    private final String POINT = "*";

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }

    public void rectangleToString() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
               if (i == 0 || i == width - 1 || i > 0 && i < width && j == 0 || j == height - 1) {
                   System.out.print(POINT);
               } else {
                   System.out.printf(" ");
               }
            }
            System.out.println();
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
