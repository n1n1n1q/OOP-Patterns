package ua.edu.ucu.apps.mail;

import ua.edu.ucu.apps.mail.mailcode.LotteryMail;
import ua.edu.ucu.apps.mail.mailcode.MailCode;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client c = new Client("Oleg", LocalDate.now(), "Male", "hi2@gmail.com");
        MailCode code = new LotteryMail();
        System.out.println(code.generate(c));
    }
}
