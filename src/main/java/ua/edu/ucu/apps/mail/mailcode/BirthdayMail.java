package ua.edu.ucu.apps.mail.mailcode;

import ua.edu.ucu.apps.mail.Client;

public class BirthdayMail implements MailCode {
    public String generate(Client client) {
        return String.format("Dear %S! HAPPY BIRTHDAY!", client.getName());
    }
}
