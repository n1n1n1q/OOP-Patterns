package ua.edu.ucu.apps.mail.mailcode;

import ua.edu.ucu.apps.mail.Client;

public class LotteryMail implements MailCode {
    public String generate(Client client) {
        return String.format("%s, YOU WON $1,000,000!!!!!!!!!!!!!!!!!!!", client.getName());
    }
}
