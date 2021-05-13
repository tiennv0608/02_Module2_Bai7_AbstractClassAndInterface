package comparator;

import java.util.Comparator;

import shape.rectangle.square.Square;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square o1, Square o2) {
        if (o1.getSide() > o2.getSide()) {
            return 1;
        } else if (o1.getSide() < o2.getSide()) {
            return -1;
        } else {
            return 0;
        }
    }
}
