package exerciseSix.Bank;

import exerciseSix.Customer;

public class BankManager {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        System.out.println(bank1.vault);
        Customer customer1 = new Customer("Sam Doe", 1234);
    }
}
