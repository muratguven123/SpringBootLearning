package ApplicationContext.Örnek2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
  public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      NotificationService notificationService = (NotificationService) context.getBean("notificationService.class");
      notificationService.notifyUser("Hello World");

  }




}
