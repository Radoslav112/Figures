package models;

import interfaces.Figure;

/**
 * Circle model that contains Central point O and radius
 */
public class Circle extends Point {
    double radius;

    public Circle(double x, double y,double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
