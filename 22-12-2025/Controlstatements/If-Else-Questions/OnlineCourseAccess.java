//Online Course Access
//A student can access a course if the course is paid for or the student has a scholarship , and the course in not expired.
//Question: Design the Java decision logic.

import java.util.Scanner;

class OnlineCourseAccess{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("if the course is paid for ? (True/False)");
		boolean paid =sc.nextBoolean();
		
		System.out.print("If student has a scholarship ? (True/False)");
		boolean scholarship =sc.nextBoolean();
		
		System.out.print("Whether the course is not expired ? (True/False)");
		boolean expired =sc.nextBoolean();
		if (paid || scholarship && expired){
			System.out.println("A Student can access a course");
		} else {
				System.out.println("A student can not access a course");
		}
				sc.close();
	}
}