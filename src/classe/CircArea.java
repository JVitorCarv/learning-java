package classe;

public class CircArea {
    double radius;
    static double pi = 3.14;
    static final double PI = 3.14561;

    CircArea(double initialRadius) {
        radius = initialRadius;
    }

    double getArea() {
        return pi * Math.pow(radius, 2);
    }

    static double getArea(double informedRadius) {
        return PI * Math.pow(informedRadius, 2);
    }
}
