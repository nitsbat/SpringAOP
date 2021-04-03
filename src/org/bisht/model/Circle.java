package org.bisht.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter is called");
        this.name = name;
    }
}
