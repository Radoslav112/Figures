package models;

import interfaces.Figure;

/**
 * Model of triangle that contains its 3 Points
 */
public class Triangle implements Figure {
    private Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    /**
     * Calculate length of segment between point A and B
     * @return Returns length of AB
     */
    private double calcAB(){
        double x = Math.abs(this.a.getX()-this.b.getX());
        double y = Math.abs(this.a.getY()-this.b.getY());
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    /**
     * Calculate length of segment between point A and C
     * @return Returns length of AC
     */
    private double calcAC(){
        double x = Math.abs(this.a.getX()-this.c.getX());
        double y = Math.abs(this.a.getY()-this.c.getY());
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    /**
     * Calculate length of segment between point A and C
     * @return Returns length of BC
     */
    private double calcBC(){
        double x = Math.abs(this.b.getX()-this.c.getX());
        double y = Math.abs(this.b.getY()-this.c.getY());
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    /**
     * Calculate half the parameter of triangle
     * @return
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
        System.out.println(String.format("Triangle with points A(%f,%f), B(%f,%f), C(%f,%f)",getA().getX(),getA().getY(),getB().getX(),getB().getY(),getC().getX(),getC().getY()));
    }
}
