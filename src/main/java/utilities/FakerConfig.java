package utilities;

import net.datafaker.Faker;

import java.util.Locale;

public class FakerConfig {

    Faker faker = new Faker(Locale.ENGLISH);

    public static FakerConfig getFaker() {
        return new FakerConfig();
    }

    public String getEmailAddress () {
        return faker.internet().emailAddress();
    }

    public String getPassword () {
        return faker.internet().password();
    }

    public String getFirstName () {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

}
