//2)WAP TO PRINT EVEN INDEX OF FROM AN ELEMENTS ?

import java.util.Scanner;
//import java.util.Array;

class EvenIndex
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter array elements:");
		        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at even index:");
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + " : " + arr[i]);
            }
        }

        sc.close();
    }
}
		