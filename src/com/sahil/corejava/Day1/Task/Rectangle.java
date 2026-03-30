package com.sahil.corejava.Day1.Task;

public class Rectangle implements Shape {
    double length;
    double breadth;

    Rectangle(double length, double width){
    this.length = length;
    this.breadth = width;
    }

    @Override
     public double area(){
            return length*breadth;
        }

    @Override
    public double perimeter(){
        return 2 * (length + breadth);
    }

}



