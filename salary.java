
import java.util.Scanner;

class WeeklyToMonthly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee weekly wages: ");
        double weeklyWages = sc.nextDouble();

        double monthlySalary = weeklyWages * 52 / 12;

        System.out.println("Monthly Salary = " + monthlySalary);

        sc.close();
    }
}