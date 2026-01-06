// File Name: DisariumNumber.java
// WAP to check whether a number is Disarium or not

import java.util.Scanner;

class DisariumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int count = 0;

        // Step 1: Count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;

        // Step 2: Calculate sum of digit^position
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            count--;
            temp = temp / 10;
        }

        // Step 3: Check Disarium
        if (sum == num) {
            System.out.println(num + " is a Disarium Number");
        } else {
            System.out.println(num + " is NOT a Disarium Number");
        }

        sc.close();
    }
}
