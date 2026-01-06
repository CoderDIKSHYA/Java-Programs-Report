//2. Employee Attendance System (User Input Based)
//Rules
//Present → working hours > 8
//Half-Day → working hours between 4 and 8
//Absent → working hours < 4

import java.util.Scanner;
 class EmployeeAttendanceSystem {
	 public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		   
		   System.out.print(" Enter Working Hours");
			   int workingHours =sc.nextInt();
		   
		   if (workingHours > 8)
		   {
			    System.out.println("Present" );
		   } else if  (workingHours <= 4 && workingHours >= 8)
		   {
			   System.out.println("Half-Day");
		   } else
		 {
			   System.out.print("Absent");
		 }
		  
 sc.close();
 }
 }
 
 
 
