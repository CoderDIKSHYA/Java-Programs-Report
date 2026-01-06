// Question:
// Grade Evaluation
// Take 3 subject marks, calculate average,
// assign grade, and display performance remarks using switch-case.

import java.util.Scanner;

class GradeEvaluation
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks of subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int m3 = sc.nextInt();

        // Calculate average
        int avg = (m1 + m2 + m3) / 3;
        System.out.println("Average Marks: " + avg);

        // Determine grade using if-else
        char grade;

        if(avg >= 90)
            grade = 'A';
        else if(avg >= 75)
            grade = 'B';
        else if(avg >= 60)
            grade = 'C';
        else if(avg >= 40)
            grade = 'D';
        else
            grade = 'F';

        // Display remarks using switch-case
        switch(grade)
        {
            case 'A':
                System.out.println("Grade: A");
                System.out.println("Excellent Performance");
                break;

            case 'B':
                System.out.println("Grade: B");
                System.out.println("Very Good Performance");
                break;

            case 'C':
                System.out.println("Grade: C");
                System.out.println("Good Performance");
                break;

            case 'D':
                System.out.println("Grade: D");
                System.out.println("Needs Improvement");
                break;

            case 'F':
                System.out.println("Grade: F");
                System.out.println("Fail");
                break;
        }
    }
}
