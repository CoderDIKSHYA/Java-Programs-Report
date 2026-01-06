// Bank Transaction Validation
// Create a parameterized method that accepts account balance
// and withdraw amount and decides whether the transaction can proceed.
// The method returns a meaningful message instead of printing directly.

class BankTransaction
{
    public static void main(String[] args)
    {
        String result = validateTransaction(5000, 2000);
        System.out.println(result);
    }

    public static String validateTransaction(double balance, double withdrawAmount)
    {
        if (withdrawAmount <= 0)
        {
            return "Invalid withdrawal amount";
        }
        else if (withdrawAmount <= balance)
        {
            return "Transaction successful";
        }
        else
        {
            return "Insufficient balance";
        }
    }
}
