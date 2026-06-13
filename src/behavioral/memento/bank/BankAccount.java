package behavioral.memento.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class BankAccount {
    private String id;
    private double balance;

    public void deposit(double amount){
        // Some business logic
        if(amount<=0){
            System.out.println("[ERROR] Please enter valid balance!");
            return;
        }
        System.out.println("Balance: $"+balance);
        System.out.println("deposit: $"+amount);
        balance+=amount;
        System.out.println("[INFO] Your deposit was successful");
        System.out.println("New Balance: "+balance);
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("[ERROR] Cannot process this operation, please choose reasonable balance.");
            return;
        }
        System.out.println("Balance: $"+balance);
        System.out.println("withdraw: $"+amount);
        balance-=amount;
        System.out.println("[INFO] Your withdraw was successful");
        System.out.println("New Balance: $"+balance);
    }


    public AccountMemento save(){
        return new AccountMemento(this.balance);
    }

    public void restore(AccountMemento memento){
        this.balance = memento.balance();
    }
}
