// Exam Result Analyser
// Create a method that accepts marks of three subjects as parameters
// and returns the grade.
// The calling method should decide whether the student is eligible
// for placement training.

import java.util.Scanner;

class ExamResultAnalyser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject 1:");
        int sub1 = sc.nextInt();

        System.out.println("Enter marks of subject 2:");
        int sub2 = sc.nextInt();

        System.out.println("Enter marks of subject 3:");
        int sub3 = sc.nextInt();

        char grade = calculateGrade(sub1, sub2, sub3);
        System.out.println("Grade obtained: " + grade);

        if (grade == 'A' || grade == 'B')
        {
            System.out.println("Eligible for placement training");
        }
        else
        {
            System.out.println("Not eligible for placement training");
        }

        sc.close();
    }

    public static char calculateGrade(int sub1, int sub2, int sub3)
    {
        int average = (sub1 + sub2 + sub3) / 3;

        if (average >= 75)
        {
            return 'A';
        }
        else if (average >= 60)
        {
            return 'B';
        }
        else if (average >= 50)
        {
            return 'C';
        }
        else
        {
            return 'F';
        }
    }
}
