package ua.edu.ucu.apps.mail;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private MailSender mailSender;
    void addMailInfo(MailInfo mail) {
        infos.add(mail);
    }
    void sendAll() {
        for(MailInfo mail: infos) {
            mailSender.sendMail(mail);
        }
    }
}
