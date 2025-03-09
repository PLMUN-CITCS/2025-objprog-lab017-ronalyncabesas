import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        char grade = calculateGrade(score); // Call the method to calculate the grade

        System.out.println("Your Grade is: " + grade);
        input.close();
    }

    // Method to calculate the letter grade
    public static char calculateGrade(int score) {
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}