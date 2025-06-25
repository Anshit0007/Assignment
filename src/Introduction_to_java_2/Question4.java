package Introduction_to_java_2;
import java.util.Scanner;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.print("Enter shape name (CIRCLE / RECTANGLE / SQUARE): ");
        String shapeName = scanner.nextLine();
        Shape shape = shapeFactory.getShape(shapeName);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape!");
        }
        scanner.close();
    }
}
