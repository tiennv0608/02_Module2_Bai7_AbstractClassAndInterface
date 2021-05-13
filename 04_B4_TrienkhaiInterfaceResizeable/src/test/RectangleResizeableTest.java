package test;

import shape.rectangle.Rectangle;

public class RectangleResizeableTest {
    public static void main(String[] args) {
        RectangleResizeable[] rectangles = new RectangleResizeable[3];
        rectangles[0] = new RectangleResizeable(15,20);
        rectangles[1] = new RectangleResizeable();
        rectangles[2] = new RectangleResizeable("blue",true,50,40);

        System.out.println("Pre-resize:");
        for (RectangleResizeable rect: rectangles) {
            System.out.println(rect.getArea());
        }
        System.out.println("After-resize:");
        for (RectangleResizeable rect: rectangles) {
            rect.reSize((int)(Math.random()*100));
            System.out.println(rect.getArea());
        }
    }
}
