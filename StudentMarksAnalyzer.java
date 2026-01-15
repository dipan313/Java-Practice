import java.util.Scanner;

public class StudentMarksAnalyzer {

    // Function to calculate average
    static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    // Function to find highest marks
    static int findHighest(int[] marks) {
        int max = marks[0];
        for (int m : marks) {
            if (m > max) {
                max = m;
            }
        }
        return max;
    }

    // Function to find lowest marks
    static int findLowest(int[] marks) {
        int min = marks[0];
        for (int m : marks) {
            if (m < min) {
                min = m;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Display Pass / Fail
        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            if (marks[i] >= 40) {
                System.out.println("Student " + (i + 1) + ": Pass");
            } else {
                System.out.println("Student " + (i + 1) + ": Fail");
            }
        }

        // Calculations
        System.out.println("\nAverage Marks: " + calculateAverage(marks));
        System.out.println("Highest Marks: " + findHighest(marks));
        System.out.println("Lowest Marks: " + findLowest(marks));

        sc.close();
    }
}
