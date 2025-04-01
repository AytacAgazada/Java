package Lesson;
import java.util.Scanner;
public class SalaryBonusCalculator {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter their job position (Manager, Developer, Intern): ");
        String job = scn.nextLine();

        System.out.print("Enter their base salary: ");
        int salary = scn.nextInt();

        double bonus = 0;

        String result = salaryCalculate(job,salary,bonus);
        System.out.println(result);

    }

    public static String checkJob(String job, int salary, double bonus) {
        switch (job) {
            case "Manager":
                bonus = 0.2 * salary;
                break;
            case "Developer":
                bonus = 0.1 * salary;
                break;
            case "Intern":
                bonus = 0.05 * salary;
                break;
            default:
                return "Please select one of three jobs!";
        }
        return null;
    }

    public static String salaryCalculate (String job, int salary, double bonus) {

        String sal = (salary <= 0) ? "Invalid salary!!!" : "Valid salary!";
        System.out.println(sal);

        checkJob(job, salary, bonus);

        salary += bonus;
        System.out.println("Salary with bonus: " + salary);
        if (salary >= 10000) {
            return "High salary!";
        } else if (salary > 5000 && salary < 10000) {
            return "Good salary!";
        }else {
            return "Keep working hard!";
        }

    }
}
