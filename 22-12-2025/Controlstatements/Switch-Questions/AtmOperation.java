// Question:
// ATM Operation Selection with ID Range Verification
// User selects:
// 1 - Withdraw
// 2 - Deposit
// 3 - Balance Enquiry
// 4 - Exit
// Verify Customer ID using exact value and range, then perform operations.

import java.util.Scanner;

class AtmOperation
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();

        // ID verification using if-else and range
        if(customerId == 1234)
        {
            System.out.println("Customer ID verified (Exact Match)");
        }
        else if(customerId >= 1 && customerId <= 2000)
        {
            System.out.println("Customer ID verified (Range Match)");
        }
        else
        {
            System.out.println("Invalid Customer ID. Access Denied.");
            return;  
        }

        // ATM operations start after verification
        System.out.print("Enter the balance amount: ");
        double balanceAmount = sc.nextDouble();

        System.out.println("User selects:");
        System.out.println("1-Withdraw");
        System.out.println("2-Deposit");
        System.out.println("3-Balance Enquiry");
        System.out.println("4-Exit");

        int select = sc.nextInt();

        switch(select)
        {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();

                if(withdraw > 0 && withdraw <= balanceAmount)
                {
                    balanceAmount -= withdraw;
                    System.out.println("Withdraw successful");
                    System.out.println("Remaining balance: " + balanceAmount);
                }
                else
                {
                    System.out.println("Invalid or insufficient amount");
                }
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();

                if(deposit > 0)
                {
                    balanceAmount += deposit;
                    System.out.println("Deposit successful");
                    System.out.println("Updated balance: " + balanceAmount);
                }
                else
                {
                    System.out.println("Invalid deposit amount");
                }
                break;

            case 3:
                System.out.println("Balance Enquiry: Your balance is " + balanceAmount);
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
