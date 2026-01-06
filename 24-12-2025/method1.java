import java.util.Scanner;

class method1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");

        int choice = sc.nextInt();

        if (choice == 1)
        {
            addition();
        }
        else if (choice == 2)
        {
            subtraction();
        }
        else if (choice == 3)
        {
            division();
        }
        else
        {
            System.out.println("Invalid choice");
        }

        sc.close();
    }

    public static void addition()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int m = sc.nextInt();
        System.out.println("Enter second number");
        int n = sc.nextInt();

        int res = m + n;
        System.out.println("Addition: " + res);
    }

    public static void subtraction()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int m = sc.nextInt();
        System.out.println("Enter second number");
        int n = sc.nextInt();

        int res = m - n;
        System.out.println("Subtraction: " + res);
    }

    public static void division()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int m = sc.nextInt();
        System.out.println("Enter second number");
        int n = sc.nextInt();

        if (n != 0)
        {
            int res = m / n;
            System.out.println("Division: " + res);
        }
        else
        {
            System.out.println("Division by zero not allowed");
        }
    }
}
