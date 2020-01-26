package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeShape(final String shapeClass) {
        switch (shapeClass) {
            case SHOPPING:
                return new ShoppingTask("Weekend Shopping", "Bread", 3.0);
            case PAINTING:
                return new PaintingTask("Roller painting", "Blue", "Wall");
            case DRIVING:
                return new DrivingTask("Give me a lift", "Airport", "Bike");
            default:
                return null;
        }
    }
}




