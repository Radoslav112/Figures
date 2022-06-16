package controllers;

import interfaces.Figure;
import models.Circle;

public class circleController implements Figure {
    private final Circle circle;

    public circleController(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double calculateSurface() {
        return Math.PI*circle.getRadius()*circle.getRadius();
    }

    @Override
    public void print() {
        System.out.println(String.format("Circle with centre O(%f,%f) and radius %f",circle.getX(),circle.getY(),circle.getRadius()));
    }
}
