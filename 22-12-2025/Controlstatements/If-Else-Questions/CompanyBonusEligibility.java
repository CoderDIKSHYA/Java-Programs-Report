//Company Bonus Eligibility
//An employee gets a bonus if experience more than or equal 5 years and performance rating more than or equal 4.
//Question: write the decision making logic 

import java.util.Scanner;

class CompanyBonusEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter experience years: ");
        double experienceYears = sc.nextDouble();

        System.out.print("Enter performance rating: ");
        double performanceRating = sc.nextDouble();

        if (experienceYears >= 5 && performanceRating >= 4) {
            System.out.println("Employee gets a bonus");
        } else {
            System.out.println("Employee does not get a bonus");
        }

        sc.close();
    }
}
