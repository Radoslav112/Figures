import interfaces.Figure;
import models.Circle;
import models.Point;
import models.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Add figures to List
     * @param figures List of figures
     */
    private static void addFigures(List<Figure> figures){
        figures.add(new Circle(12,3,5));
        figures.add(new Triangle(new Point(2,3),new Point(4,12),new Point(12,13)));
        figures.add(new Triangle(new Point(5,12),new Point(23,-12),new Point(-32,24)));
        figures.add(new Circle(-12,3,5));
    }

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        addFigures(figures);

        for(Figure figure:figures){
            figure.Print();
            System.out.println(String.format("Area of figure: %f\n",figure.CalculateSurface()));
        }
    }
}
