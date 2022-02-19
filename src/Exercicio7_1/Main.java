package Exercicio7_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = scan.nextLine();

        System.out.print("Gross Salary: ");
        employee.grossSalary = scan.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scan.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("\nWhich percentage to increase salary? ");
        employee.IncreaseSalary(scan.nextDouble());

        System.out.println("\nUpdated data: " + employee);
        scan.close();
    }
}
