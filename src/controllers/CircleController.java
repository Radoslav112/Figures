package controllers;

import interfaces.Figure;
import models.Circle;

public class CircleController implements Figure {
    private final Circle circle;

    public CircleController(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double CalculateSurface() {
        return Math.PI*circle.getRadius()*circle.getRadius();
    }

    @Override
    public void Print() {
        System.out.println(String.format("Circle with centre O(%f,%f) and radius %f",circle.getX(),circle.getY(),circle.getRadius()));
    }
}
