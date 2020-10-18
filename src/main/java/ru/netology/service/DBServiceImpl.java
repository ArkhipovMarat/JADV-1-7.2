package ru.netology.service;

import ru.netology.DB.DataBase;

public class DBServiceImpl implements DBService{
    DataBase dataBase;

    public DBServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}
