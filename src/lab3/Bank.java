package lab3;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }
    public void addAccount(Account account) {
        if (!accounts.containsKey(account.getAccountNumber())) {
            accounts.put(account.getAccountNumber(), account);
            System.out.println("Account added: " + account);
        } else {
            throw new IllegalArgumentException("счет с таким номером уже существует");
        }
    }
    public void removeAccount(String accountNumber) {
        Account removedAccount = accounts.remove(accountNumber);
        if (removedAccount != null) {
            System.out.println("счет удален: " + removedAccount);
        } else {
            System.out.println("счет с этим номером не найден");
        }
    }
    public void depositToAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("внесено " + amount + " на счет: " + account);
        } else {
            System.out.println("счет с этим номером не найден");
        }
    }
    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("снято " + amount + " с счета: " + account);
        } else {
            System.out.println("счет с этим номером не найден");
        }
    }
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("нет счетов в банке");
        } else {
            System.out.println("счета в банке:");
            for (Account account : accounts.values()) {
                System.out.println(account);
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("123456", "Alice", 1000.0);
        Account account2 = new Account("654321", "Bob", 500.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.displayAllAccounts();

        bank.depositToAccount("123456", 200.0);

        bank.withdrawFromAccount("654321", 100.0);

        bank.removeAccount("123456");

        bank.displayAllAccounts();
    }
}
