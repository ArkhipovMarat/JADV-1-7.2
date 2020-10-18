package ru.netology.DB;

import ru.netology.value_object.Client;
import ru.netology.value_object.Recipiency;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private Map<Client, Recipiency> recipienciesDB;

    public DataBase() {
        this.recipienciesDB = new HashMap<>();
    }

    public Map<Client, Recipiency> getRecipienciesDB() {
        return recipienciesDB;
    }
}
