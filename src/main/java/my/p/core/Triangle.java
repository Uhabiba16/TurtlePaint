package my.p.core;

import java.awt.*;

public class Triangle extends Shape {
    private int length;

    public Triangle(Turtle turtle, Point location, Color color, int border, int length) {
        super(turtle, location, color, border);
        this.length = length;
    }

    @Override
    public void paint() {

    }
}
