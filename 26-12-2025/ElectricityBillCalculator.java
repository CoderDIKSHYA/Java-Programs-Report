// Electricity Bill Calculator
// Create a parameterized method that accepts units consumed
// and calculates the bill based on slab rates.
// Boundary values are handled using conditional checks.

import java.util.Scanner;

class ElectricityBillCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Units consumed:");
        int units = sc.nextInt();

        double bill = calculateBill(units);
        System.out.println("Bill calculated based on slab rates: " + bill);

        sc.close();
    }

    public static double calculateBill(int units)
    {
        double amount = 1;

        if (units <= 0)
        {
            return 0;
        }
        else if (units <= 100)
        {
            amount = units * 1.5;
        }
        else if (units <= 200)
        {
            amount = (100 * 1.5) + (units - 100) * 2.5;
        }
        else
        {
            amount = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
        }

        return amount;
    }
}
