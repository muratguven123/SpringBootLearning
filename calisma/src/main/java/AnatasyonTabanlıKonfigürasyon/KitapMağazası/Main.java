package AnatasyonTabanlıKonfigürasyon.KitapMağazası;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnatasyonTabanlıKonfigürasyon.KitapMağazası")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        BookController bookController = context.getBean(BookController.class);
        bookController.addNewBook("Spring in action",10);
        bookController.displayInventory("Spring in action");

    }
}
