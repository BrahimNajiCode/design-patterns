package behavioral.memento.bank;

public class App {
    public static void main(String[] args) {
        BankAccount ACC1 = new BankAccount("1001", 1000);
        AccountHistory accountHistory = new AccountHistory();

        ACC1.deposit(100);
        accountHistory.push(ACC1.save());

        ACC1.withdraw(200);
        // Regret this operation

        ACC1.restore(accountHistory.pop());
        System.out.println("NEW BALANCE: $"+ACC1.getBalance());

    }
}
