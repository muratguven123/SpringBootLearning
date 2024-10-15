package ApplicationContext.Örnek1;

public class MyService {
    private final DataRepository depositRepository;

    public MyService(DataRepository depositRepository) {
        this.depositRepository = depositRepository;
    }
    public void processData(){
        String data = depositRepository.getData();
    }
}
