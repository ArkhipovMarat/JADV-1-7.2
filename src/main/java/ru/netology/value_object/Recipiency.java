package ru.netology.value_object;

public class Recipiency {
    private Veterinarian veterinarian;
    private Client client;
    private Pet pet;
    private String symptoms;
    private String diagnostic;
    private RecipiencyStatus recipiencyStatus;

    public Recipiency(Veterinarian veterinarian, Client client, Pet pet, String symptoms, String diagnostic, RecipiencyStatus recipiencyStatus) {
        this.veterinarian = veterinarian;
        this.client = client;
        this.pet = pet;
        this.symptoms = symptoms;
        this.diagnostic = diagnostic;
        this.recipiencyStatus = recipiencyStatus;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public Client getClient() {
        return client;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void setRecipiencyStatus(RecipiencyStatus recipiencyStatus) {
        this.recipiencyStatus = recipiencyStatus;
    }

    @Override
    public String toString() {
        return " Client: " + client +
                " Veterinarian:" + veterinarian +
                " Pet:" + pet +
                " Symptoms: " + symptoms +
                " Diagnostic: " + diagnostic +
                " Status: " + recipiencyStatus;
    }
}
