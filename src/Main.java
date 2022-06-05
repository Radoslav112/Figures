import controllers.CircleController;
import controllers.TriangleController;
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
        figures.add(new CircleController(new Circle(12,3,5)));
        figures.add(new TriangleController(new Triangle(new Point(2,3),new Point(4,12),new Point(12,13))));
        figures.add(new TriangleController(new Triangle(new Point(5,12),new Point(23,-12),new Point(-32,24))));
        figures.add(new CircleController(new Circle(-12,3,5)));
    }

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        addFigures(figures);

        double sumArea=0;

        for(Figure figure:figures){
            figure.Print();
            sumArea+=figure.CalculateSurface();
        }

        System.out.println(String.format("Summary area of all figure: %f\n",sumArea));
    }
}
