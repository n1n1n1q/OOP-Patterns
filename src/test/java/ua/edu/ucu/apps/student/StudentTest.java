package ua.edu.ucu.apps.student;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class StudentTest {

    @Test
    public void testStudentBuilder() {
        Student student = Student.builder()
                .age(20)
                .height(180)
                .grade(90)
                .grade(85)
                .group("CS-101")
                .firstName("Anton")
                .lastName("Anten")
                .build();

        assertEquals(20, student.getAge());
        assertEquals(180, student.getHeight());
        assertEquals(Arrays.asList(90, 85), student.getGrades());
        assertEquals("CS-101", student.getGroup());
        assertEquals("Anton", student.getFirstName());
        assertEquals("Anten", student.getLastName());
    }

    @Test
    public void testStudentToString() {
        Student student = Student.builder()
                .age(22)
                .height(175)
                .grade(88)
                .grade(92)
                .group("CS-102")
                .firstName("John")
                .lastName("Doe")
                .build();

        String expectedString = "Student(firstName=John, lastName=Doe, age=22, height=175, grades=[88, 92], group=CS-102)";
        assertEquals(expectedString, student.toString());
    }
}