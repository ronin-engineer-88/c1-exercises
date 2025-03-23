package _12_Exception.Exercise08;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            System.out.println("Số dư hiện tại của bạn là: " + account.getBalance());
            account.fundout(1200);
        } catch (InsufficientFundsException e) {
            System.err.println("Giao dịch thất bại: " + e.getMessage());
        } finally {
            System.out.println("Số dư hiện tại sau giao dịch: " + account.getBalance());
        }
    }
}
