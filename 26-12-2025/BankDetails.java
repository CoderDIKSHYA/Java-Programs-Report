import java.util.Scanner;

class 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        boolean exit = false;

        while (!exit)
        {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    balance = withdraw(balance, withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    balance = deposit(balance, depositAmount);
                    break;

                case 3:
                    displayDetails(accountNumber, balance);
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }

    // Withdraw Method (Parameterized)
    public static double withdraw(double balance, double amount)
    {
        if (amount > balance)
        {
            System.out.println("Insufficient Balance");
            return balance;
        }
        else
        {
            System.out.println("Amount Withdrawn: " + amount);
            return balance - amount;
        }
    }

    // Deposit Method (Parameterized)
    public static double deposit(double balance, double amount)
    {
        System.out.println("Amount Deposited: " + amount);
        return balance + amount;
    }

    // Display Details Method
    public static void displayDetails(long accNo, double balance)
    {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accNo);
        System.out.println("Available Balance: " + balance);
    }
}
{
	amt =username;
	bal;
	
	if(withdraw(amt,bal))
	{
		----
			
		
	}
	else 
	{
		----
			
	}
	
	boolean withdraw(double amt, double bal))
	{
		return amt>) && amt <= bal;
	}