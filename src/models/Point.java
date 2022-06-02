package models;

/**
 * Model that contains coordinates X and Y of point
 */
public class Point {
    private double X,Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }
}
