// Login Authentication System
// Design a method that accepts username and password as parameters
// and validates them against predefined credentials.
// The method should return a status code (not boolean)

import java.util.Scanner;

class LoginAuthentication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String name = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        int res = login(name, password);
        System.out.println("Status code is: " + res);
        sc.close();
    }

    public static int login(String name, String password)
    {
        String preName = "Dikshya runuwal";
        String prePassword = "dikshya@123";

        if (name.equals(preName) && password.equals(prePassword))
        {
            return 1;   // Login successful
        }
        else
        {
            return 0;   // Login failed
        }
    }
}
