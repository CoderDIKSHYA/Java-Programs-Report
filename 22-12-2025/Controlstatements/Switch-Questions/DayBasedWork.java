//Day based work schedule
//based on day number (1-7),print:
//weekday
//weekend
//Question:Design the switch case logic


import java.util.Scanner;

class DayBasedWork
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number of the week : ");
		int week=sc.nextInt();
		
		switch(week){
			
		case 1:
			System.out.println("WeekDay");
		break;
			case 2:
			System.out.println("WeekDay");
		break;
			case 3:
			System.out.println("WeekDay");
		break;
			case 4:
			System.out.println("WeekDay");
		break;
			case 5:
			System.out.println("WeekDay");
		break;
			case 6:
			System.out.println("WeekEnd");
		break;
			case 7:
			System.out.println("WeekEnd");
		break;
		default:
			System.out.println("Invalid number");
		
	}
}
}