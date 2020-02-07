package com.java.external.geometrical.figures.task;

public class EquilateralTriangle {
    private int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public void drawEmptyEquilateralTriangle() {
        for(int i = 0; i < sideLength; i++ ){
            for(int j = sideLength - 1 + i; j >=0; j--) {
                if(j - i ==  i || j - i == -i || (i == sideLength - 1 && j % 2 ==0)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
