import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.println("Enter student grades (type -1 to finish):");

        // Input grades
        while (true) {
            System.out.print("Enter grades: ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break; // Stop input on sentinel value
            }

            if (grade < 0 || grade > 100) {
                System.out.println("Please enter a valid grade between 0 and 100.");
                continue;
            }

            grades.add(grade);
        }

        // Check if grades list is empty
        if (grades.isEmpty()) {
            System.out.println("No grades entered. Exiting program.");
            return;
        }

        // Compute average, highest, and lowest grades
        int total = 0, highest = grades.get(0), lowest = grades.get(0);

        for (int grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / grades.size();

        // Output results
        System.out.println("\n--- Grade Report ---");
        System.out.println("Number of grades: " + grades.size());
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}
