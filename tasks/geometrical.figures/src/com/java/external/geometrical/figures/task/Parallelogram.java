/**
 * External Java Course
 * The class has one public method that prints paralelogram by taking height and width as parameters.
 * @autor Serhii Horbachov
 *
 */
package com.java.external.geometrical.figures.task;

public class Parallelogram {

    private final char BLANK = ' ';
    private final char DISPLAYED_SYMBOL = '*';

    public String showParallelogram(int width, int height) throws IllegalAccessException {

        if( width <= 1 || height <= 1 ){
            throw new IllegalAccessException("Parameters must be greater than 1.");
        }

        StringBuilder paralelogramBuilder = new StringBuilder();
        String innerLine = buildInnerLine(width);
        int leftPad = height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = leftPad; j > 0; j--) {
                paralelogramBuilder.append(BLANK);
            }
            --leftPad;

            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    paralelogramBuilder.append(DISPLAYED_SYMBOL);
                }
            } else {
                paralelogramBuilder.append(innerLine);
            }

            paralelogramBuilder.append("\n");
        }

        return paralelogramBuilder.toString();
    }

    private String buildInnerLine(int width) {
        StringBuilder line = new StringBuilder();

        for (int i = 0; i < width; i++) {
            if (i == 0 || i == width - 1) {
                line.append(DISPLAYED_SYMBOL);
            } else {
                line.append(BLANK);
            }
        }

        return line.toString();
    }

}



