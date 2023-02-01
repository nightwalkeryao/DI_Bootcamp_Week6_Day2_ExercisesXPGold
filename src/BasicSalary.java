import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {
        double basicSalary = 0;
        double grossSalary = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        basicSalary = sc.nextDouble();
        sc.close();

        if(basicSalary <= 10000) {
            grossSalary = basicSalary + (basicSalary * 20/100) + (basicSalary * 80/100);
        } else if(basicSalary <= 20000) {
            grossSalary = basicSalary + (basicSalary * 25/100) + (basicSalary * 90/100);
        } else {
            grossSalary = basicSalary + (basicSalary * 30/100) + (basicSalary * 95/100);
        }

        System.out.println("Gross salary: "+ grossSalary);
    }
}
