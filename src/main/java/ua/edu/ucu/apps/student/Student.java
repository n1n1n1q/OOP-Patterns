package ua.edu.ucu.apps.student;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter @ToString @SuperBuilder
public class Student extends Human {
    private int age;
    private int height;
    @Singular
    private List<Integer> grades;
    private String group;
}
