package org.example;

public class Department {
    final private int id;
    private String name;

    public Department(
            int id,
            String name
    ) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
