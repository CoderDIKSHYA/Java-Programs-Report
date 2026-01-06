// 3) WAP to print odd index elements from an array

import java.util.Scanner;

class OddIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at odd index:");
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {   // odd index condition
                System.out.println("Index " + i + " : " + arr[i]);
            }
        }

        sc.close();
    }
}
