//Railway Ticket Confirmation
//A ticket is :
// Confirmed of seats are avaiable
//Wailisted if seats are full but RAC i avaiable
//Cancelled otherwise
//Question:Frame decision-making logic in java 

import java.util.Scanner;

class RailwayTicketConfirmation{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Are seats available ? (True/false) ");
			boolean seatsAvailable = sc.nextBoolean();
			
			    System.out.print("Is RAC available? (true/false): ");
        boolean racAvailable = sc.nextBoolean();
		
		if(seatsAvailable){
			System.out.println("Confirmed");
		} else if (racAvailable){
				System.out.println("Waitlisted");
			} else {
					System.out.println("Cancelled");
				}
					sc.close();
	}
}

