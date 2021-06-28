package com.thohariakbar.Shaping;

public class Square extends Rectangle {

    private double side;
    private String color;
    private boolean filled;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
    }

    public void setLength(double side) {
    }

    public double getArea(double side) {
        double area = side * side;
        return area;
    }

    public double getPerimeter(double side) {
        double perimeter = 4*side;
        return perimeter;
    }
}
