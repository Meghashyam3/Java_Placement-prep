import java.util.*;

public class StudentEmailFormatter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine().trim();

        System.out.print("Enter College Name: ");
        String collegeName = sc.nextLine().trim();

        System.out.print("Enter Branch Name: ");
        String branchName = sc.nextLine().trim();

        String upperCaseName = fullName.toUpperCase();

        String lowerCaseName = fullName.toLowerCase();

        String emailUsername = lowerCaseName.replace(" ", ".");

        String collegeEmail = emailUsername + "@nmims.edu";

        boolean validCollegeEmail = collegeEmail.contains("@");

        boolean longName = fullName.length() > 15;

        System.out.println("Original Name          : " + fullName);
        System.out.println("Uppercase Name         : " + upperCaseName);
        System.out.println("Lowercase Name         : " + lowerCaseName);
        System.out.println("College Name           : " + collegeName);
        System.out.println("Branch Name            : " + branchName);
        System.out.println("Generated Email        : " + collegeEmail);
        System.out.println("Valid College Email    : " + validCollegeEmail);
        System.out.println("Long Name Status       : " + longName);
        sc.close();
    }
}