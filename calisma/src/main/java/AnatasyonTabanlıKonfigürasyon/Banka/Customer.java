package AnatasyonTabanlıKonfigürasyon.Banka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private AccountService accountService;

    @Autowired
    public Customer(AccountService accountService){
        this.accountService = accountService;
    }
    public void makeDeposit(double amount){
        accountService.deposit(amount);
    }
    public void makeWithdraw(double amount){
        accountService.withdraw(amount);
    }
}
