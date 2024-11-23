package ua.edu.ucu.apps.mail;

import lombok.*;

import java.time.LocalDate;

@ToString @AllArgsConstructor @Getter @NoArgsConstructor
@Setter
public class Client {
    private static int counter = 0;
    private final int id = counter++;
    private String name;
    private LocalDate dob;
    private String sex;
    private String email;
}
