//Build a Shape hierarchy: Circle, Rectangle, Triangle with area() and perimeter() using polymorphism. No switch statements allowed. 

abstract class Shape{
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return Math.PI *radius * radius;
    }

    double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return length* width ;
    }

    double perimeter(){
        return 2 *(length + width);
    }
}

class Triangle extends Shape{
    double a,b,c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area(){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    double perimeter(){
        return a+b+c;
    }
}

public class Task1{
    public static void main(String args[]){
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10,15);
        Shape s3 = new Triangle (5,5,5);


        System.out.println("Circle area: " +s1.area());
        System.out.println("Circle perimeter: " +s1.perimeter());

        System.out.println("Rectangle area: " +s2.area());
        System.out.println("Rectangle perimeter: " +s2.perimeter());

        System.out.println("Triangle area: " +s3.area());
        System.out.println("Triangle perimeter: " +s3.perimeter());

    }
}
