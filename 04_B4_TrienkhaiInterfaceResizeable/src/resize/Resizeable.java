package resize;

import shape.Shape;

public interface Resizeable<C extends Shape> {
    double reSize(double percent);

}
