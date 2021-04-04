package org.bisht.service;

import org.bisht.annotation.Loggable;
import org.bisht.model.Circle;
import org.bisht.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    @Loggable
    public Circle getCircle() {
        System.out.println("Method called");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
