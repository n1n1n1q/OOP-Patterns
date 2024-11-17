package ua.edu.ucu.apps.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString @AllArgsConstructor @Getter
public class Client {
    private static int counter = 0;
    private final int id = counter++;
    private String name;
    private LocalDate dob;
    private String sex;
    private String email;
}
