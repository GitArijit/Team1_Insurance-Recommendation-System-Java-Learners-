//Abstract base class
abstract class Shape{
    public abstract double area();
    public abstract double perimeter();

    //Method to display shape info
    public void displayInfo(){
        System.out.println(this.getClass().getSimpleName() + ":");
        System.out.println(" Area: " + area());
        System.out.println(" Perimeter: " + perimeter());
    }
}

//Circle Class
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

//Rectangle Class
class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }

    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
}

//Triangle Class
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area(){
        double s = perimeter()/2;  //semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }
}

public class Shapes{
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);

        System.out.println(" - Shapes Information - ");
        for(Shape shape : shapes){
            shape.displayInfo();
            System.out.println();
        }
    }
}