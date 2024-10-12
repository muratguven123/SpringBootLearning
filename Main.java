package JavaTabanlıKonfigürasyon.Banka;

import AnatasyonTabanlıKonfigürasyon.Banka.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Customer customer = context.getBean(Customer.class);
        customer.makeDeposit(200);
        customer.makeDeposit(50);
    }
}
