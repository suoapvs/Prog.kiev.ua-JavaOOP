package com.yurii.salimov.lesson03.task04;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Rectangle extends Figure {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = Math.abs(height);
        this.width = Math.abs(width);
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                drawSymbol(i, j);
            }
            System.out.println();
        }
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public static Rectangle combine(Rectangle rectangle1, Rectangle rectangle2) {
        return new Rectangle(
                rectangle1.getHeight() + rectangle2.getHeight(),
                rectangle1.getWidth() + rectangle2.getWidth()
        );
    }

    private void drawSymbol(int i, int j) {
        if ((i == 0) && (j == 0)) {
            System.out.print("┌");
        } else if ((i == 0) && (j == this.width - 1)) {
            System.out.print("┐");
        } else if ((i == this.height - 1) && (j == 0)) {
            System.out.print("└");
        } else if ((i == this.height - 1) && (j == this.width - 1)) {
            System.out.print("┘");
        } else if (((i == 0) && (j > 0) && (j < this.width - 1)) ||
                ((i == height - 1) && (j > 0) && (j < this.width - 1))) {
            System.out.print("-");
        } else if (((j == 0) && (i > 0) && (i < this.height - 1)) ||
                ((j == this.width - 1) && (i > 0) && (i < this.height - 1))) {
            System.out.print("│");
        } else {
            System.out.print(" ");
        }
    }
}
