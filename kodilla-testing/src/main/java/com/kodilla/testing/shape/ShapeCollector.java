package com.kodilla.testing.shape;
import com.kodilla.testing.forum.ForumComment;

import java.util.*;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector collector = (ShapeCollector) o;

        if (!shape.equals(collector.shape)) return false;
        return figures.equals(collector.figures);
    }

    @Override
    public int hashCode() {
        int result = shape.hashCode();
        result = 31 * result + figures.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shape=" + shape +
                '}';
    }

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

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
