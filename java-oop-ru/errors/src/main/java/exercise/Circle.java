package exercise;

import java.awt.*;

// BEGIN
public class Circle {
    int radius;
    Point center;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
            return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        else {
            return Math.PI * radius * radius;
        }
    }

}
// END
