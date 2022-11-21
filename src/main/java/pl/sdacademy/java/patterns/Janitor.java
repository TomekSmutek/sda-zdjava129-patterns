package pl.sdacademy.java.patterns;

public class Janitor implements HasPerson{
    private Person person;
    @Override
    public Person getPerson() {
        return person;
    }
}
