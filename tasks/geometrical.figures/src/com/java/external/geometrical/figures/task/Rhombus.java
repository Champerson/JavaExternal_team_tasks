package com.java.external.geometrical.figures.task;

public class Rhombus {
    private final int horD = 13;

    public Rhombus() {
    }

    public int getHorD() {
        return horD;
    }


    public void showRhombus() {
        for (int i = 0; i <= horD / 2; i++) {
            for (int j = 0; j < (horD - i); j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < (horD - i); j++) {
                System.out.printf(" ");
            }
            System.out.println();
        }
        for (int i = horD/2 - 1 ; i >= 0; i--) {
            for (int j = 0; j < (horD - i + 1); j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < (horD - i); j++) {
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
