package controllers;

import interfaces.Figure;
import models.Triangle;

public class TriangleController implements Figure {

    private final Triangle triangle;

    public TriangleController(Triangle triangle) {
        this.triangle = triangle;
    }

    /**
     * Calculate length of segment between point A and B
     * @return Returns length of AB
     */
    private double calcAB(){
        double x = Math.abs(this.triangle.getA().getX()-this.triangle.getB().getX());
        double y = Math.abs(this.triangle.getA().getY()-this.triangle.getB().getY());
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    /**
     * Calculate length of segment between point A and C
     * @return Returns length of AC
     */
    private double calcAC(){
        double x = Math.abs(this.triangle.getA().getX()-this.triangle.getC().getX());
        double y = Math.abs(this.triangle.getA().getY()-this.triangle.getC().getY());
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    /**
     * Calculate length of segment between point A and C
     * @return Returns length of BC
     */
    private double calcBC(){
        double x = Math.abs(this.triangle.getB().getX()-this.triangle.getC().getX());
        double y = Math.abs(this.triangle.getB().getY()-this.triangle.getC().getY());
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    /**
     * Calculate half the parameter of triangle
     * @return (a+b+c)/c
     */
    private double calcP(){
        double c = calcAB();
        double b = calcAC();
        double a = calcBC();
        return (a+b+c)/2;
    }

    @Override
    public double CalculateSurface() {
        double c = calcAB();
        double b = calcAC();
        double a = calcBC();
        double p = calcP();
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void Print() {
        System.out.println(
                String.format(

                        "Triangle with points A(%f,%f), B(%f,%f), C(%f,%f)",
                        triangle.getA().getX(),
                        triangle.getA().getY(),
                        triangle.getB().getX(),
                        triangle.getB().getY(),
                        triangle.getC().getX(),
                        triangle.getC().getY()
                )
        );
    }
}
