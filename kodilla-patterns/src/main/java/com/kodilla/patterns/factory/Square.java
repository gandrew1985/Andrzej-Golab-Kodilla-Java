package com.kodilla.patterns.factory;

public class Square implements Shape {
    private final String name;
    private final double width;

    public Square(final String name, final double width) {
        this.name = name;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

    @Override
    public double getCircumference() {
        return 4 * width;
    }
}
