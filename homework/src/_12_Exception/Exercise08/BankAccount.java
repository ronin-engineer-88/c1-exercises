package _12_Exception.Exercise08;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void fundout(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Số dư tài khoản của bạn không đủ để rút " + amount + " VND.");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công. Số dư còn lại của bạn là: " + balance);
    }
}
