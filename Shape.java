
public interface Shape {
    double area();
    double perimeter();

}

class Circle implements Shape{
    double radius;
    double pi = 3.14;
    Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;

    }
}
class Rectangle implements Shape{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}
class Triangle implements Shape{
    int a,b,c;
    int base,height;
    Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    Triangle(int base, int height){
        this.base=base;
        this.height=height;
    }
    public  double perimeter(){
        return a+b+c;
    }
    public double area(){
        return 0.5*base*height;
    }

}
class Main{
    public static void main(String[] args){
        Shape s;
        s=new Circle(23);
        System.out.println("The area of the Circle is: " +s.area());
        System.out.println("The perimeter of the Circle is: " +s.perimeter());

        s=new Rectangle(23, 27);
        System.out.println("The area of the Rectangle is: " +s.area());
        System.out.println("The perimeter of the Rectangle is: " +s.perimeter());

        s=new Triangle(10,20);
        System.out.println("The area of the Triangle is: " +s.area());
        s=new Triangle(4,5,7);
        System.out.println("The perimeter of the Triangle is: " +s.perimeter());

    }
}
