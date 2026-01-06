//Shopping Cart Validation
//Checkout is allowed only if the cart is not empty and the delivery address is valid.
//Question: Write Java logic using decision statements 
import java.util.Scanner;

class ShoppingCartValidation  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("is cart  empty ? (true/false): ");
		boolean cartEmpty= sc.nextBoolean();
		
		System.out.print("is delivery address valid ? (true/false):");
		boolean validAddress=sc.nextBoolean();
		
		if (!cartEmpty && validAddress)
		{
			System.out.println("Checkout is allowed");
		} else {
            System.out.println("Checkout is not allowed");
		}
		sc.close();
		
	}
}


