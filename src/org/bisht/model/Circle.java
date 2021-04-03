package org.bisht.model;

public class Circle {
    private String name;

    public String getName() {
        System.out.println("Getter");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter is called");
        this.name = name;
        throw (new RuntimeException());
    }

    public String setNameAndReturn(String name) {
        System.out.println("Setter is called");
        this.name = name;
        return name;
    }
}
