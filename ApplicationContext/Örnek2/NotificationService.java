package ApplicationContext.Örnek2;

import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationService {
    private final MessageService messageService;

    public NotificationService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }
    public void notifyUser(String message) {
        messageService.sendMassage(message);
    }
}
