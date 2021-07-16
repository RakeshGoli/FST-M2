package Junit;

public class BankAccount {
    private Integer bal;
    
    // Create a constructor
    public BankAccount(Integer initialBalance) {
        bal = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (bal < amount) {
            throw new NotEnoughFundsException(amount, bal);
        }
        bal -= amount;
        return bal;
    }
}