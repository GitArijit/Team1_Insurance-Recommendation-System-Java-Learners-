package com.sahil.corejava.Day1.Task;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3.7);
        Shape rectangle = new Rectangle(7.5, 5.5);
        Shape triangle = new Triangle(7, 4.7, 9);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Perimeter of triangle: " + rectangle.perimeter());
    }
}
