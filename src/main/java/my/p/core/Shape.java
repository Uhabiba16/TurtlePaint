package my.p.core;

import java.awt.*;

public abstract class Shape implements Drawable {
    private Turtle turtle;
    private Point location;
    private Color color;
    private int border;

    public Shape(Turtle turtle, Point location, Color color, int border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }
    public abstract void paint();
}
