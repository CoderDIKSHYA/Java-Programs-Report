// 4) WAP to find sum of all given elements from an array

import java.util.Scanner;

class FindSumOfAllArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of all the given elements from the array: " + sum);

        sc.close();
    }
}
