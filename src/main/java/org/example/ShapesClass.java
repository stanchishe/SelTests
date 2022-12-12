package org.example;
// Клас Shapes от 06.12 използван за примерни тестове
public class ShapesClass {
    private int numberOfSides;
    private String shapeName = "2d_polygon";

    public ShapesClass(int numberOfSides) {
        if (numberOfSides < 3 || numberOfSides == Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        this.numberOfSides = numberOfSides;
    }

    public ShapesClass(int numberOfSides, String shapeName) {
        if (numberOfSides < 3
                || (numberOfSides == Integer.MAX_VALUE && !shapeName.toLowerCase().equals("circle")))
        {
            throw new IllegalArgumentException();
        }
        this.numberOfSides = numberOfSides;
        this.shapeName = shapeName;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public String getShapeName() {
        return shapeName;
    }
}
