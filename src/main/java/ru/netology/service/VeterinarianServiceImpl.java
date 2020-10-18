package ru.netology.service;

import ru.netology.value_object.Client;
import ru.netology.value_object.Recipiency;
import ru.netology.value_object.RecipiencyStatus;

public class VeterinarianServiceImpl implements VeterinarianService{
    DBService dbService;

    public VeterinarianServiceImpl(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public void cureAnimal(Client client, String diagnosticText, RecipiencyStatus recipiencyStatus) {
        Recipiency recipiency = dbService.getDataBase().getRecipienciesDB().get(client);
        recipiency.setDiagnostic(diagnosticText);
        recipiency.setRecipiencyStatus(recipiencyStatus);
        dbService.getDataBase().getRecipienciesDB().put(client, recipiency);
    }
}
