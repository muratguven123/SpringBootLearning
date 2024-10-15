package ApplicationContext.Örnek2;

public class SmsService implements MessageService{
    @Override
    public void sendMassage(String message){
        System.out.println("SMS sent with message: "+message);

    }
}
