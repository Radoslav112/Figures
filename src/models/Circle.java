package models;

import interfaces.Figure;

/**
 * Circle model that contains Central point O and radius
 */
public class Circle extends Point implements Figure {
    double radius;

    public Circle(double x, double y,double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double CalculateSurface() {
        return Math.PI*radius*radius;
    }

    @Override
    public void Print() {
        System.out.println(String.format("Circle with centre O(%f,%f) and radius %f",getX(),getY(),radius));
    }
}
