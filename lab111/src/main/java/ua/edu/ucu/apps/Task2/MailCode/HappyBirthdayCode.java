package ua.edu.ucu.apps.Task2.MailCode;

import ua.edu.ucu.apps.Task2.Client;

public class HappyBirthdayCode implements MailCode{
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy birthday", client.getName());
    }
    
}
