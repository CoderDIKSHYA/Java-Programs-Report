// Loan Eligibility Checker with EMI calculation
// Checks:
// 1. EMI affordability
// 2. Existing loans count
// 3. Number of times loan applied

import java.util.Scanner;

class LoanEligibilityChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Monthly Income:");
        double income = sc.nextDouble();

        System.out.println("Enter Loan Amount:");
        double loanAmount = sc.nextDouble();

        System.out.println("Enter Annual Interest Rate:");
        double annualRate = sc.nextDouble();

        System.out.println("Enter Loan Tenure (in months):");
        int months = sc.nextInt();

        System.out.println("Enter number of active loans:");
        int activeLoans = sc.nextInt();

        System.out.println("Enter number of times loan application sent:");
        int applicationCount = sc.nextInt();

        String result = checkEligibility(
                income,
                loanAmount,
                annualRate,
                months,
                activeLoans,
                applicationCount
        );

        System.out.println("Loan Status: " + result);
        sc.close();
    }

    public static String checkEligibility(
            double income,
            double loanAmount,
            double annualRate,
            int months,
            int activeLoans,
            int applicationCount)
    {
        double monthlyRate = annualRate / (12 * 100);

        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Calculated EMI: " + emi);

        if (emi > income * 0.4)
        {
            return "Rejected : EMI exceeds 40% of monthly income";
        }
        else if (activeLoans >= 2)
        {
            return "Rejected : Too many active loans";
        }
        else if (applicationCount > 3)
        {
            return "Rejected : Too many loan applications";
        }
        else
        {
            return "Approved";
        }
    }
}
