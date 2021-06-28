package com.thohariakbar.Shaping;

public class Circle extends Shape {
    double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getPerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
