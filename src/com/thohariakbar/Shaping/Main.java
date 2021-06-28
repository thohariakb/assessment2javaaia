package com.thohariakbar.Shaping;

public class Main {

    public static void main(String[] args) {

        Circle newCircle = new Circle();
        newCircle.setRadius(20.0);
        newCircle.toString();
        System.out.println(newCircle.getPerimeter(150.0));

        Rectangle newRectangle = new Rectangle();
        newRectangle.setWidth(30.0);
        newCircle.toString();
        System.out.println(newRectangle.getArea(100.0));;

        Square newSquare = new Square();
        newCircle.toString();
        System.out.println(newSquare.getArea(20.0));
    }
}
