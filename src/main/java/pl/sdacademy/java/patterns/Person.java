package pl.sdacademy.java.patterns;

import java.util.UUID;

public class Person {
    private UUID uuid;
    private String firstName;
    private String lastName;

    public UUID getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(UUID uuid, String firstName, String lastName) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
