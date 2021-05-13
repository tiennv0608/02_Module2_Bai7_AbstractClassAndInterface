package shape;

import shape.circle.Circle;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape);

        shape = new Circle(3.5,"red", false);
        System.out.println(shape);

    }
}
