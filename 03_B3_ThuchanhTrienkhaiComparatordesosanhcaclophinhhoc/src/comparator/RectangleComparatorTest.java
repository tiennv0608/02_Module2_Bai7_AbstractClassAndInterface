package comparator;

import shape.rectangle.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(100,20);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle("black",false,50,40);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle:
             rectangles) {
            System.out.println(rectangle);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);

        System.out.println("After-sorted:");
        for (Rectangle rectangle:
                rectangles) {
            System.out.println(rectangle);
        }
    }
}
