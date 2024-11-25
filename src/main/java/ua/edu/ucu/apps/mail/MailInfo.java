package ua.edu.ucu.apps.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.mail.mailcode.MailCode;

@AllArgsConstructor @Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;
    public String generate() {
        return mailCode.generate(client);
    }
}
