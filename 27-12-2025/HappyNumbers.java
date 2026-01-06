// File Name: HappyNumbers.java
// Program to print all Happy Numbers from 1 to 500

class HappyNumbers {

    public static void main(String[] args) {

        int a = 1;
        System.out.println("Happy numbers from 1 to 500 : ");

        for (int i = 1; i <= 500; i++) {
            if (isHappyNumbers(i)) {
                System.out.print(i + " ");
            }
    }
	}

    static boolean isHappyNumbers(int num) {

        int sum;

        while (num != 1 && num != 4) {
            sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + (digit * digit);
                num = num / 10;
            }

            num = sum;
        }

        return num == 1;
    }
}
