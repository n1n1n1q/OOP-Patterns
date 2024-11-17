package ua.edu.ucu.apps.mail;

import lombok.Getter;
import ua.edu.ucu.apps.mail.mailcode.MailCode;

public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailCode;
    public String generate() {
        return mailCode.generate(client);
    }
}
