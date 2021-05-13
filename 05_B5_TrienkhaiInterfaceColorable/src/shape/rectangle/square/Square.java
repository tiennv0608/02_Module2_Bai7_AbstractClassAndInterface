package shape.rectangle.square;

import colorable.Colorable;
import shape.rectangle.Rectangle;

public class Square extends Rectangle implements Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "A square with side = " + getSide() + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side");
    }
}
