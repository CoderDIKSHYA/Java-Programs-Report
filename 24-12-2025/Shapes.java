import java.util.Scanner;

class Shapes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("\nChoose the shape:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Area of Square = " + square());
                    break;

                case 2:
                    System.out.println("Perimeter of Rectangle = " + rectangle());
                    break;

                case 3:
                    System.out.println("Area of Triangle = " + triangle());
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("\nDo you want to exit? (true/false): ");
            exit = sc.nextBoolean();
        }

        sc.close();
        System.out.println("Program terminated.");
    }

    public static int square() {
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        return side * side;
    }

    public static int rectangle() {
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        return 2 * (l + b);
    }


    public static double triangle() {
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        return 0.5 * b * h;
    }
}
