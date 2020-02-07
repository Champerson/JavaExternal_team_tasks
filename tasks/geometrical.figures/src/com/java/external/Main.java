package com.java.external;

import com.java.external.geometrical.figures.task.EquilateralTriangle;
import com.java.external.geometrical.figures.task.Paralelogram;
import com.java.external.geometrical.figures.task.Rectangle;
import com.java.external.geometrical.figures.task.Rhombus;


public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Rectangle rectangle = new Rectangle();
        Paralelogram paralelogram = new Paralelogram();
        Rhombus rhombus = new Rhombus();
        rectangle.rectangleToString();
        System.out.println(paralelogram.showParalelogram(20, 15));
       rhombus.showRhombus();
      EquilateralTriangle eTriangle = new EquilateralTriangle( 15);
        eTriangle.drawEmptyEquilateralTriangle();

        
    }
}
