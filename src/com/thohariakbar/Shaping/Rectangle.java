package com.thohariakbar.Shaping;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(double length) {
        double area = length * width;
        return area;
    }

    public double getPerimeter(double length) {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
