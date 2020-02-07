package com.java.external.geometrical.figures.task;

public class RightTriangle {

    public static void rightTriangle() {
        int height = 10;
        int width = 20;
        int startWidth = 0;
        for (int i = 0; i < height; i++, startWidth++) {
            System.out.print("*");

            for (int j = 0; j < startWidth; j++) {
                System.out.print(" ");
                System.out.print(" ");

            }
            if (startWidth != 0) System.out.print("*");
            System.out.print("\n");
        }

        for (int i = 0; i < width + 2; i++) {

            System.out.print("*");
        }
    }
}
