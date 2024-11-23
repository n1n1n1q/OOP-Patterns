package ua.edu.ucu.apps.mail;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import ua.edu.ucu.apps.mail.mailcode.BirthdayMail;
import ua.edu.ucu.apps.mail.mailcode.LotteryMail;
import ua.edu.ucu.apps.mail.mailcode.MailCode;

public class MailInfoTest {
    MailInfo mailBdayInfo;
    MailInfo mailLotteryInfo;
    Client client;
    MailCode mailBdayCode;
    MailCode mailLotteryCode;
    @Before
    public void setUp() {
        client = new Client();
        client.setName("John Doe");
        mailBdayCode = new BirthdayMail();
        mailBdayInfo = new MailInfo(client, mailBdayCode);
        mailLotteryCode = new LotteryMail();
        mailLotteryInfo = new MailInfo(client, mailLotteryCode);
    }

    @Test
    public void testGenerateWithBirthdayMailCode() {
        String expectedMessage = "Dear JOHN DOE! HAPPY BIRTHDAY!";
        assertEquals(expectedMessage, mailBdayInfo.generate());
    }

    @Test
    public void testGenerateWithLotteryMailCode() {
        String expectedMessage = "John Doe, YOU WON $1,000,000!!!!!!!!!!!!!!!!!!!";
        assertEquals(expectedMessage, mailLotteryInfo.generate());  
    }
}