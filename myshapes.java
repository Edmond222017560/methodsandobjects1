// Interface for Shape
interface Shape {
    void draw();
}

// Class for Circle implementing the Shape interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Class for Rectangle implementing the Shape interface
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Class for Triangle implementing the Shape interface
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
// class for Square implementing the shape interface
class Square implements Shape {
@Override
public void draw(){
System.out. println("Drawing a Square");
}
}
// Class to demonstrate calling methods
public class myshapes {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        circle.draw();
        rectangle.draw();
        triangle.draw();
        square.draw();
    }
}