//3. Bank Account Status Check 
//An account is :
//"Active" if (balance mpre than or equals minimum balance 
//"Low balance" if balance is less than minimum balance 
//"Frozen" if the account if flagged
//Question: Write decision making logic to determine account status 

import java.util.Scanner;
class BankAccountStatusCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account details : ");
		double balance = sc.nextDouble();
		
		System.out.print("Enter minimum balance: ");
        double minBalance = sc.nextDouble();
		
		//System.out.print("Is account frozen? (true/false): ");
       // boolean frozen = sc.nextBoolean();
		
		if(balance >= minBalance){
			System.out.println("Active");
		} else if (balance < minBalance){
			System.out.println("Low Balance");
		} else 
		{
			System.out.println("Frozen");
		
		}
		sc.close();
	}
}



