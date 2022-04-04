import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countBadGrades = Integer.parseInt(sc.nextLine());
        String input = " ";
        int brBadGrades = 0;
        String lastProblem = " ";
        int problems = 0;
        double allGrade = 0;
        double avgGrade = 0;
        boolean isExcluded = false;
        boolean start = true;

        while(start) {
            if(countBadGrades <= brBadGrades){
                isExcluded = true;
                break;
            }

            input = sc.nextLine();
            if (input.equals("Enough")){
                start = false;
                break;
            } else {
                lastProblem = input;
            }

            int grade = Integer.parseInt(sc.nextLine());
            allGrade = allGrade + grade;

            if (grade <= 4){
                brBadGrades++;
            }
            problems++;

        }
        avgGrade = allGrade / problems;
        if (isExcluded){
            System.out.printf("You need a break, %d poor grades.", brBadGrades);
        } else {
            System.out.printf(" Average score: %.2f%n", avgGrade);
            System.out.printf(" Number of problems: %d%n", problems);
            System.out.printf(" Last problem: %s", lastProblem);
        }
    }
}
