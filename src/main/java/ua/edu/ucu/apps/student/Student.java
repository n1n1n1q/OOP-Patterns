package ua.edu.ucu.apps.student;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Getter @ToString @Builder
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    @Singular
    private List<Integer> grades;
    private String group;
}
