package com.thohariakbar.Shaping;

public abstract class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(Boolean filled) {
        return filled;
    };

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    abstract double getArea(double length);
    abstract double getPerimeter(double length);
}
