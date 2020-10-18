package ru.netology.service;

import ru.netology.value_object.Client;
import ru.netology.value_object.Recipiency;

public interface RegistrationService {
    void addRegistration (Recipiency recipiency);
    void showRegistrations ();
    void showRegistration (Client client);
}
