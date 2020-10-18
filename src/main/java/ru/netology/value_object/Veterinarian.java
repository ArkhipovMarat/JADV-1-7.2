package ru.netology.value_object;

public class Veterinarian {
    String name;
    String id;

    public Veterinarian(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
