package ua.edu.ucu.apps.mail;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MailSender {

    private final String smtpHost;
    private final String smtpPort;
    private final String username;
    private final String password;

    public MailSender(String smtpHost, String smtpPort, String username, String password) {
        this.smtpHost = smtpHost;
        this.smtpPort = smtpPort;
        this.username = username;
        this.password = password;
    }

    public void sendMail(MailInfo mailInfo) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailInfo.getClient().getEmail()));
            message.setSubject("Brobra");
            message.setText(mailInfo.generate());
            Transport.send(message);
            System.out.println("Mail sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
