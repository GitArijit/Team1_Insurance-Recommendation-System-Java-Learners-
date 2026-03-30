package com.sahil.corejava.Day1.Task;
public class Triangle implements Shape{
    double a,b,c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double perimeter(){
        return a+b+c;
    }
}
