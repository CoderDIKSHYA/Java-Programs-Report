//Movie rating system
//based on rating:
//1-poor
//2-Average 
//3-good
//4-excellent
//Question: Write a switch case based decision program 

import java.util.Scanner;

class  MovieRatingSystem
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the movie");
		String movieName=sc.nextLine();
		
		//System.out.println("Enter rating");
		//Double enterRating=sc.nextDouble();
		
		System.out.println("enter the rating for the movie");
		System.out.println("Poor");
		System.out.println("Average");
		System.out.println("Good");
		System.out.println("Excellent");
			
		int rating = sc.nextInt();
		
		switch(rating){
			
			case 1:
				System.out.println("Poor");
				break;
			case 2:
				System.out.println("Average");
			    break;
			case 3:
				System.out.println("Good");
			    break;
			case 4:
				System.out.println("Excellent");
				break;
			default:
				System.out.println("invalid rating");
			    break;
		}
	}
}
