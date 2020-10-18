package ru.netology.service;

import ru.netology.value_object.Client;
import ru.netology.value_object.Recipiency;

public class RegistrationServiceImpl implements RegistrationService{

    DBService dbService;

    public RegistrationServiceImpl(DBService dbService) {
        this.dbService = dbService;
    }

    public void addRegistration(Recipiency recipiency) {
        dbService.getDataBase().getRecipienciesDB().put(recipiency.getClient(), recipiency);
    }

    @Override
    public void showRegistrations() {
        dbService.getDataBase().getRecipienciesDB().entrySet().forEach(System.out::println);

    }

    @Override
    public void showRegistration(Client client) {
        System.out.println(dbService.getDataBase().getRecipienciesDB().get(client));
    }
}
