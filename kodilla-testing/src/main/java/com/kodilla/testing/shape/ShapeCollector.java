package com.kodilla.testing.shape;
import com.kodilla.testing.forum.ForumComment;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n >= 0 && n < figures.size()) {
            shape = figures.get(n);
        }
        return shape;
    }

    public void showFigures() {
        int i = 0;
        while (i != figures.size()) {
            System.out.println(figures.get(i).getShapeName());
            i++;
        }
    }

    public int getSize() {
        return figures.size();
    }
}
