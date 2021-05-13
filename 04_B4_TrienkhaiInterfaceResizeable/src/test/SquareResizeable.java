package test;

import resize.Resizeable;
import shape.rectangle.square.Square;

public class SquareResizeable extends Square implements Resizeable {
    public SquareResizeable() {
    }

    public SquareResizeable(double side) {
        super(side);
    }

    public SquareResizeable(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double reSize(double percent) {
        if(percent <= 100 && percent >= 1){
            this.setSide(getSide() + (getSide()*(percent/100)));
        }
        return this.getSide();
    }
}
