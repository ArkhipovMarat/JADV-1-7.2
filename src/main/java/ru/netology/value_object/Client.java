package ru.netology.value_object;

import java.util.Objects;

public class Client {
    String name;
    Pet pet;

    public Client(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(pet, client.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pet.getId());
    }
}
