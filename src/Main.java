public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("Rectangle",3.7,6.21),
                new Rhombus("Rhombus",12.38),
                new Triangle("Rhombus",12.0,9.9,14.2),
                new Square("Square",14.3),
                new Hexagon("Hexagon",5.578)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.getName());
            System.out.print("Perimeter: ");
            System.out.println(shape.getPerimeter());
            System.out.println("__________________________");
        }
    }
}