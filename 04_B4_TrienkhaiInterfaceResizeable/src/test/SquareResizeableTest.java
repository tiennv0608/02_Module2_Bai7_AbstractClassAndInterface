package test;

public class SquareResizeableTest {
    public static void main(String[] args) {
        SquareResizeable[] squares = new SquareResizeable[3];
        squares[0] = new SquareResizeable(10);
        squares[1] = new SquareResizeable();
        squares[2] = new SquareResizeable("blue",true,100);

        System.out.println("Pre-resize:");
        for (SquareResizeable square: squares) {
            System.out.println(square.getArea());
        }
        System.out.println("After-resize:");
        for (SquareResizeable square: squares) {
            square.reSize((int)(Math.random()*100));
            System.out.println(square.getArea());
        }
    }
}
