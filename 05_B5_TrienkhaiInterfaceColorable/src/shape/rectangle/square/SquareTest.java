package shape.rectangle.square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        System.out.println("Area is: "+square.getArea());
        System.out.println("Perimeter is: "+square.getPerimeter());

        square = new Square(2.3);
        System.out.println(square);
        System.out.println("Area is: "+square.getArea());
        System.out.println("Perimeter is: "+square.getPerimeter());

        square = new Square("yellow", true,5.8);
        System.out.println(square);
        System.out.println("Area is: "+square.getArea());
        System.out.println("Perimeter is: "+square.getPerimeter());
    }

}
