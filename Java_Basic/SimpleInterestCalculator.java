import java.util.*;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Customer Name: ");
        String customerName = sc.nextLine();

        System.out.println("Principal Amount: ");
        double principalAmount = sc.nextDouble();

        System.out.println("Annual Interest Rate: ");
        float annualInterestRate = sc.nextFloat();

        System.out.println("Time in Years: ");
        int timeInYears = sc.nextInt();

        double simpleInterest = (principalAmount * annualInterestRate * timeInYears) / 100;

        double finalAmount = principalAmount + simpleInterest;

        double monthlyInterest = simpleInterest / (timeInYears * 12);

        boolean highInterest = simpleInterest > 10000;

        boolean eligibleForLoan = principalAmount >= 50000;

        double processingFee = 500;

        finalAmount += processingFee;

        System.out.println("===== SIMPLE INTEREST REPORT =====");

        System.out.println("Customer Name               : " + customerName);
        System.out.println("Principal Amount            : " + principalAmount);
        System.out.println("Annual Interest Rate        : " + annualInterestRate);
        System.out.println("Time in Years               : " + timeInYears);
        System.out.println("Simple Interest             : " + simpleInterest);
        System.out.println("Monthly Interest            : " + monthlyInterest);
        System.out.println("Processing Fee              : " + processingFee);
        System.out.println("Final Amount                : " + finalAmount);
        System.out.println("High Interest               : " + highInterest);
        System.out.println("Eligible For Loan           : " + eligibleForLoan);

        sc.close();
    }
}