import java.util.*;

public class StudentScholarshipEvaluator{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.println("Enter CGPA: ");
        float cgpa = sc.nextFloat();

        System.out.println("Enter Attendance Percentage: ");
        float attendancePercentage = sc.nextFloat();

        System.out.println("Enter No.of Backlog Count: ");
        int backlogCount = sc.nextInt();

        System.out.println("Enter Family Income: ");
        double familyIncome = sc.nextDouble();

        System.out.println("Enter Section: ");
        char section = sc.next().charAt(0);

        boolean scholarshipEligible = cgpa >= 8.0 && familyIncome < 300000 && backlogCount ==0;

        boolean internshipEligible = cgpa >= 7.0 &&attendancePercentage >= 75;

        boolean placementEligible = attendancePercentage >= 80 && backlogCount <= 1;

        String performance;
        if (cgpa >= 9.0) {
            performance = "Excellent";
        }
        else if (cgpa >= 8.0) {
            performance = "Very Good";
        }
        else if (cgpa >= 7.0) {
            performance = "Good";
        }
        else if (cgpa >= 6.0) {
            performance = "Average";
        }
        else {
            performance = "Needs Improvement";
        }

        String feeDiscount;
        if (familyIncome < 200000) {
            feeDiscount = "50% Discount";
        }
        else if (familyIncome < 400000) {
            feeDiscount = "25% Discount";
        }
        else {
            feeDiscount = "10% Discount";
        }

        String mentorName;
        switch (section) {
            case 'A':
                mentorName = "Dr. Bhushan Inje";
                break;
            case 'B':
                mentorName = "Dr. Suraj Patil";
                break;
            case 'C':
                mentorName = "Dr. Dhananjay Joshi";
                break;
            case 'D':
                mentorName = "Dr. Bipin Jadhav";
                break;
            default:
                mentorName = "Invalid Section";
                break;
        }

        System.out.println("Student Name:         " + studentName);
        System.out.println("CGPA:                 " + cgpa);
        System.out.println("Attendance:           " + attendancePercentage);
        System.out.println("Backlogs:             " + backlogCount);
        System.out.println("Family Income:        " + familyIncome);

        System.out.println("Scholarship Eligible: " + scholarshipEligible);
        System.out.println("Internship Eligible:  " + internshipEligible);
        System.out.println("Placement Eligible:   " + placementEligible);

        System.out.println("Performance Status:   " + performance);
        System.out.println("Fee Discount:         " + feeDiscount);

        System.out.println("Section:              " + section);
        System.out.println("Mentor Name:          " + mentorName);
        sc.close();
    }
}