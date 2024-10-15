package ApplicationContext.Örnek1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyService myService(){
        return new MyService(dataRepository());
    }
    @Bean
    public DataRepository dataRepository(){
        return new DataRepository();
    }
}
