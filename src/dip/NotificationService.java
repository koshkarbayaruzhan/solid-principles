package dip;

import java.util.List;

public class NotificationService {
    private final List<IMessageSender> senders;

    public NotificationService(List<IMessageSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message) {
        for (IMessageSender sender : senders) {
            sender.send(message);
        }
    }
}
