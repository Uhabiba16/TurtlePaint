package my.p.core;

import java.awt.*;

public class Square extends Shape {
    private int length;

    public Square(Turtle turtle, Point location, Color color, int border, int length) {
        super(turtle, location, color, border);
        this.length = length;
    }

    @Override
    public void paint() {

    }
}
