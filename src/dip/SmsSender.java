package dip;

public class SmsSender implements IMessageSender {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
