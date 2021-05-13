package test;

import resize.Resizeable;
import shape.rectangle.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable() {
    }

    public RectangleResizeable(double width, double length) {
        super(width, length);
    }

    public RectangleResizeable(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public double reSize(double percent) {
        if(percent <= 100 && percent >= 1){
            this.setWidth(getWidth() + (getWidth()*(percent/100)));
            this.setLength(getLength() + (getLength()*(percent/100)));
        }
        return this.getLength();
    }
}
