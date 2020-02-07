package com.java.external;

import com.java.external.geometrical.figures.task.Paralelogram;
import com.java.external.geometrical.figures.task.Rectangle;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Rectangle rectangle = new Rectangle();
        Paralelogram paralelogram = new Paralelogram();
        rectangle.rectangleToString();
        System.out.println(paralelogram.showParalelogram(20, 15));
        
    }
}
