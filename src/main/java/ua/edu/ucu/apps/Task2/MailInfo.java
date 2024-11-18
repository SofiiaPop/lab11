package ua.edu.ucu.apps.Task2;

import ua.edu.ucu.apps.Task2.MailCode.MailCode;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }
}
