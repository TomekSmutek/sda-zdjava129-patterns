package pl.sdacademy.java.patterns;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentCsvLoaderTest {

    @Test
    void shouldLoadStudents (){
        // given
        StudentCsvLoader studentCsvLoader = new StudentCsvLoader(()->StudentCsvLoaderTest.class.getResourceAsStream("/students.csv"));

        // when
        List<Student> students = studentCsvLoader.loadStudents();

        // then
        assertThat(students).hasSize(2);

    }

}