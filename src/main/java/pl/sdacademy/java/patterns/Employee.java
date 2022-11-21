package pl.sdacademy.java.patterns;

import java.time.LocalDateTime;

public class Employee {

    private float salary;
    private LocalDateTime employmentDate;

    public Janitor janitor;
    public Teacher teacher;

    public Janitor getJanitor() {
        return janitor;
    }

    public void setJanitor(Janitor janitor) {
        this.janitor = janitor;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
