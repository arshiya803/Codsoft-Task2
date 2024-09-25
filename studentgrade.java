import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine(); 

        String[] subjectNames = new String[numSubjects];
        int totalMarks = 0;

        // Take names and marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter name for Subject " + (i + 1) + ": ");
            subjectNames[i] = sc.nextLine();

            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            int subjectMarks = sc.nextInt();
            totalMarks += subjectMarks;
            sc.nextLine(); 
        }

        // Average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine grade
        char grade = calculateGrade(averagePercentage);

        // Display marks for each subject
        System.out.println("\nSubject Marks:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjectNames[i] + ": " + (totalMarks / numSubjects)); // Placeholder for actual marks
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        

        sc.close();
    }

    // Grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
