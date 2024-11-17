package ua.edu.ucu.apps.student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = Student.builder()
                .age(20)
                .height(180)
                .grades(List.of(90, 85, 88))
                .firstName("John")
                .lastName("Doe")
                .group("CS101")
                .build();
        System.out.println(student.getFirstName());
    }
}