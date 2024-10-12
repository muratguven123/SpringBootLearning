package AnatasyonTabanlıKonfigürasyon.Banka;

import org.springframework.stereotype.Component;

@Component
public class AccountService {

    public void withdraw(double amount) {
        System.out.println(amount+ "withdrawn from the account. ");
    }
    public void deposit(double amount){
        System.out.println(amount+"deposited from the account");
    }
}
