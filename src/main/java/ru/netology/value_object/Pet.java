package ru.netology.value_object;

public class Pet {
    private String name;
    private String id;

    public Pet(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
