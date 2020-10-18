import ru.netology.DB.DataBase;
import ru.netology.service.*;
import ru.netology.value_object.*;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        DBService dbService = new DBServiceImpl(dataBase);
        RegistrationService registrationService = new RegistrationServiceImpl(dbService);
        VeterinarianService veterinarianService = new VeterinarianServiceImpl(dbService);

        Veterinarian veterinarian1 = new Veterinarian("Mike","1");
        Veterinarian veterinarian2 = new Veterinarian("John","2");

        Pet pet1 = new Pet("Sharic", "1");
        Client client1 = new Client("Monika", pet1);

        Pet pet2 = new Pet("Kvadratic", "2");
        Client client2 = new Client("Bonica", pet2);

        registrationService.addRegistration(new Recipiency(veterinarian1, client1, pet1,
                "oy oy oy", "", RecipiencyStatus.EMERGENCY));

        registrationService.addRegistration(new Recipiency(veterinarian2, client2, pet2,
                "ou ou ou", "", RecipiencyStatus.SCHEDULED));

        registrationService.showRegistration(client1);

        veterinarianService.cureAnimal(client1, "animal cured", RecipiencyStatus.CURED);

        registrationService.showRegistration(client1);
    }
}
