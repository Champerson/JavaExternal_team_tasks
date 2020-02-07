package com.java.external;

import com.java.external.geometrical.figures.task.*;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Rectangle rectangle = new Rectangle();
        Parallelogram parallelogram = new Parallelogram();
        Rhombus rhombus = new Rhombus();
        rectangle.rectangleToString();
        System.out.println(parallelogram.showParallelogram(20, 15));
        rhombus.showRhombus();
        EquilateralTriangle eTriangle = new EquilateralTriangle(15);
        eTriangle.drawEmptyEquilateralTriangle();
    }
}
