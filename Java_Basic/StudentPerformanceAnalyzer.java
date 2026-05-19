import java.util.*;
public class StudentPerformanceAnalyzer{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("==== STUDENT PERFORMANCE ANALYZER ====");

        System.out.println("Student Name: ");
        String studentName = sc.nextLine();

        System.out.println("Java Marks: ");
        int javaMarks = sc.nextInt();

        System.out.println("DBMS Marks: ");
        int dbmsMarks = sc.nextInt();

        System.out.println("Web Programming Marks: ");
        int webProgrammingMarks = sc.nextInt();

        System.out.println("DAIoT Marks: ");
        int daiotMarks = sc.nextInt();

        int bonusMarks = 5;
        bonusMarks++;
        System.out.println("Bonus Marks Added: " + bonusMarks);

        int totalSubjects = 4;

        int totalMarks = javaMarks + dbmsMarks  + webProgrammingMarks + daiotMarks + bonusMarks;
        System.out.println("Total Marks Obtained: " + totalMarks);

        float percentage = (float)totalMarks/totalSubjects;
        System.out.println("Percentage: " + percentage);

        System.out.println("Average Rounded Value: " + (int) percentage);

        boolean eligibleForInternship = percentage >= 75;
        System.out.println("Eligible for Internship: " + eligibleForInternship);

        boolean distinction = percentage >= 80;
        System.out.println("Distinction: " + distinction);

        sc.close();

    }
    }
    
