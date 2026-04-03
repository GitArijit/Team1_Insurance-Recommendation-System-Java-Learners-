/*Build a Shape hierarchy: Circle, Rectangle, Triangle 
with area() and perimeter() using polymorphism. No switch statements allowed.*/
interface Shape {
    void area();

    void perimeter();
}

class Circle implements Shape {
    double redius;

    public void area() {
        System.out.println("area of cirle - " + Math.PI * redius * redius);
    }

    public void perimeter() {
        System.out.println("perimeter of cirle - " + 2 * Math.PI * redius);
    }
}

class Rectangle implements Shape {
    double l, b;

    public void area() {
        System.out.println("area of Rectangle - " + l * b);
    }

    public void perimeter() {
        System.out.println("perimeter of Rectangle - " + 2 * (l + b));
    }
}

class Triangle implements Shape {
    double h;
    double base;
    int a, b, c;

    public void area() {
        System.out.println("area of Triangle - " + (1 / 2) * base * h);
    }

    public void perimeter() {
        System.out.println("perimeter of triangle - " + (a + b + c));
    }
}

public class task1 {
    public static void main(String[] args) {
        Circle c;
        c = new Circle();
        c.redius = 3;
        c.area();
        c.perimeter();

        Rectangle r ;
        r = new Rectangle();
        r.l = 4;
        r.b = 5;
        r.area();
        r.perimeter();

        Triangle t ;
        t = new Triangle();
        t.h = 5;
        t.b = 3;
        t.a = 4;
        t.b = 3;
        t.c = 3;
        t.area();
        t.perimeter();
    }
}
