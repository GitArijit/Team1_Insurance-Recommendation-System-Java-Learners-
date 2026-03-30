package com.sahil.corejava.Day1.Task;

public class Circle implements Shape {
    double radius;
   Circle(double radius){
       this.radius = radius;
   }

   @Override
   public double area(){
       return Math.round(Math.PI*radius*radius);
   }

   @Override
    public double perimeter(){
       return 2*Math.PI*radius;
   }
}
