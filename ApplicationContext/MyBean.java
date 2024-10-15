package ApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyBean{
    public MyBean(){
        System.out.println("Mybean Nesnesi Oluşturuldu");
    }
    @PostConstruct
    public void inti(){
        System.out.println("My bean inisiyalize ediliyor");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Mybean yok ediliyor");
    }
}
