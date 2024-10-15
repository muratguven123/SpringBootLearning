package ApplicationContext.Örnek2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
    public MessageService emailService(){
    return new EmailService();
}
@Bean
    public MessageService smsService(){
    return new SmsService();
}
public NotificationService notificationService(){
    return new NotificationService(emailService());
}
}
