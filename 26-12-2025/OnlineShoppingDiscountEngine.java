// Online Shopping Discount Engine
// Write a method that takes purchase amount and customer type
// (Regular / Premium) and returns the final payable amount after
// applying discounts.

import java.util.Scanner;

class OnlineShoppingDiscountEngine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchased amount:");
        double amount = sc.nextDouble();

        System.out.println("Enter member status (Regular / Premium):");
        String status = sc.next();

        double finalAmount = discount(amount, status);
        System.out.println("Final amount is: " + finalAmount);

        sc.close();
    }

    public static double discount(double amount, String status)
    {
        double discountRate = 0;

        if (status.equalsIgnoreCase("Premium"))
        {
            discountRate = 0.20;   // 20% discount
        }
        else if (status.equalsIgnoreCase("Regular"))
        {
            discountRate = 0.10;   // 10% discount
        }

        return amount - (amount * discountRate);
    }
}
