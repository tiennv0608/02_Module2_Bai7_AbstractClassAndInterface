package test;

import shape.Shape;
import shape.circle.Circle;
import shape.rectangle.Rectangle;
import shape.rectangle.square.Square;

public class SquareColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(2,3);
        shapes[1] = new Square();
        shapes[2] = new Circle(100);
        shapes[3] = new Square(10);

        for (Shape shape: shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Square) {
                Square square = (Square) shape;
                square.howToColor();
            }
        }
    }
}
