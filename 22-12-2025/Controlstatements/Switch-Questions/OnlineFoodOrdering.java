// Question:
// Online Food Ordering Menu
// User selects cuisine type:
// 1 - South Indian
// 2 - North Indian
// 3 - Chinese
// 4 - Italian
// Write switch-case logic to display menu items.

import java.util.Scanner;

class OnlineFoodOrdering
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Cuisine Type:");
        System.out.println("1-South Indian");
        System.out.println("2-North Indian");
        System.out.println("3-Chinese");
        System.out.println("4-Italian");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("South Indian Menu:");
                System.out.println("Idli");
                System.out.println("Dosa");
                System.out.println("Vada");
                break;

            case 2:
                System.out.println("North Indian Menu:");
                System.out.println("Paneer Butter Masala");
                System.out.println("Roti");
                System.out.println("Dal Makhani");
                break;

            case 3:
                System.out.println("Chinese Menu:");
                System.out.println("Noodles");
                System.out.println("Manchurian");
                System.out.println("Fried Rice");
                break;

            case 4:
                System.out.println("Italian Menu:");
                System.out.println("Pizza");
                System.out.println("Pasta");
                System.out.println("Garlic Bread");
                break;

            default:
                System.out.println("Invalid cuisine selection");
        }
    }
}
