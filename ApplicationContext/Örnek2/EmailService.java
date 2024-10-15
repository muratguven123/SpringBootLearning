package ApplicationContext.Örnek2;

public class EmailService implements MessageService{
    @Override
    public void sendMassage(String message){
        System.out.println("Email sent with message: "+message);
    }
}
