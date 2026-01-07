public class Solution2 {

    static class BankAccount {

        private int accountNumber;
        private int balance;

        public void setAccountDetails(int accountNumber, int balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(int amount) {
            balance += amount;
        }

        public void withdraw(int amount) {
            if (amount <= balance) {
                balance -= amount;
            }
        }

        public void display() {
            System.out.println("Account: " + accountNumber + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountDetails(1111, 5000);
        account.deposit(2000);
        account.withdraw(1000);
        account.display();
    }
}
