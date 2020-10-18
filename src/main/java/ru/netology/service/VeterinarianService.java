package ru.netology.service;

import ru.netology.value_object.Client;
import ru.netology.value_object.RecipiencyStatus;

public interface VeterinarianService {
    void cureAnimal (Client client, String diagnosticText, RecipiencyStatus recipiencyStatus);
}
