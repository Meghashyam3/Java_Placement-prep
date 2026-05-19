public class StudentProfileAnalyzer{
    public static void main(String[] args) {

        String studentName = "Meghashyam Pawar";
        int age = 20;
        int currentYear = 2;
        int totalEngineeringYears = 4;
        int remainingYears = totalEngineeringYears - currentYear;
        float cgpa = 7.3f;
        char section ='B';
        boolean isPlacementReady = true;
        byte numberOfProjects = 5;
        long feesPaid = 345000L;
        boolean eligibleCgpa = cgpa >= 7.5f;
        boolean experience = numberOfProjects >= 4;

        System.out.println("Name:                   " + studentName);
        System.out.println("Age:                    " + age);
        System.out.println("CGPA:                   " + cgpa);
        System.out.println("Section:                " + section);
        System.out.println("Remaining Years:        " + remainingYears);
        System.out.println("Placement Ready:        " + isPlacementReady);
        System.out.println("Projects Submitted:     " + numberOfProjects);
        System.out.println("Fees Paid:              " + feesPaid);
        System.out.println("Eligible for Placement: " + eligibleCgpa);
        System.out.println("Project Experience:     " + experience);
        
    }
    }
