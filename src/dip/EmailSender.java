package dip;

public class EmailSender implements IMessageSender {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
