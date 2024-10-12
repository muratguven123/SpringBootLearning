package AnatasyonTabanlıKonfigürasyon.Banka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnatasyonTabanlıKonfigürasyon.Banka")
public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Customer customer = context.getBean(Customer.class);

        customer.makeDeposit(200);
        customer.makeWithdraw(100);
    }
}
