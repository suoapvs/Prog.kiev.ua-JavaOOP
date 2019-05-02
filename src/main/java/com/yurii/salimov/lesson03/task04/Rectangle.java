package com.yurii.salimov.lesson03.task04;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Rectangle {

    private int height;
    private int width;

    public Rectangle(final int height, final int width) {
        this.height = Math.abs(height);
        this.width = Math.abs(width);
    }

    public void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                drawSymbol(i, j);
            }
            System.out.println();
        }
    }

    private void drawSymbol(final int x, final int y) {
        if ((x == 0) && (y == 0)) {
            System.out.print("┌");
        } else if ((x == 0) && (y == this.width - 1)) {
            System.out.print("┐");
        } else if ((x == this.height - 1) && (y == 0)) {
            System.out.print("└");
        } else if ((x == this.height - 1) && (y == this.width - 1)) {
            System.out.print("┘");
        } else if (((x == 0) && (y > 0) && (y < this.width - 1)) ||
                ((x == height - 1) && (y > 0) && (y < this.width - 1))) {
            System.out.print("-");
        } else if (((y == 0) && (x > 0) && (x < this.height - 1)) ||
                ((y == this.width - 1) && (x > 0) && (x < this.height - 1))) {
            System.out.print("│");
        } else {
            System.out.print(" ");
        }
    }
}
