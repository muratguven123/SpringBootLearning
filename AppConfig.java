package JavaTabanlıKonfigürasyon.Banka;

import AnatasyonTabanlıKonfigürasyon.Banka.AccountService;
import AnatasyonTabanlıKonfigürasyon.Banka.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AccountService accountService(){
        return new AccountService();
    }
    @Bean
    public Customer customer(){
        return new Customer(accountService());
    }
}
