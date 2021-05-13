package test;

import shape.circle.Circle;

public class CircleResizeableTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new CircleResizeable(2.1);
        circles[1] = new CircleResizeable();
        circles[2] = new CircleResizeable(10,"yellow",true);

        System.out.println("Pre-resize:");
        for (Circle circle: circles) {
            System.out.println(circle.getArea());
        }
        System.out.println("After-resize:");
        for (Circle circle:
                circles) {
            if (circle instanceof CircleResizeable){
                ((CircleResizeable)circle).reSize((int)(Math.random()*100));
            }
            System.out.println(circle.getArea());
        }
    }
}
