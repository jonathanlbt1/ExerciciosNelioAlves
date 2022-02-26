package ExercicioListsArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++) {
            System.out.println();
            System.out.print(String.format("\nEmployee #%d", i) + ":");

            System.out.print("\nId: ");
            int myId = scan.nextInt();
            while (hasId(list, myId)) {
                System.out.println("Id already taken. Try again.");
                myId = scan.nextInt();
            }

            System.out.print("Name: ");
            scan.nextLine();
            String myName = scan.nextLine();

            System.out.print("Salary: ");
            double mySalary = scan.nextDouble();
            scan.nextLine();

            list.add(new Funcionarios(myId, myName, mySalary));
        }

        System.out.println();
        System.out.print("Enter the number id that will have the salary increase: ");
        int bonusId = scan.nextInt();
        Funcionarios employee = list.stream().filter(x -> x.getId() == bonusId).findFirst().orElse(null);
        if(employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = scan.nextDouble();
            employee.increseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Funcionarios funcionarios : list) {
            System.out.println(funcionarios);
        }

        scan.close();
    }

    public static boolean hasId(List<Funcionarios> list, int id) {
        Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
