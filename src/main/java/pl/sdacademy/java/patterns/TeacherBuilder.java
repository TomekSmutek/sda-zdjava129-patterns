package pl.sdacademy.java.patterns;

import java.util.Set;

public class TeacherBuilder {

    private Person person;
    private Set<String> subjectCodes;

    public TeacherBuilder person (Person person) {
        this.person = person;
        return this;
    }

    public TeacherBuilder subjectCodes (Set<String> subjectCodes){
        this.subjectCodes = subjectCodes;
        return this;
    }

    public Teacher build(){
        return new Teacher(person, subjectCodes);
    }

    public TeacherBuilder subject(String subjectCode){
        return new TeacherBuilder();
    }
}
