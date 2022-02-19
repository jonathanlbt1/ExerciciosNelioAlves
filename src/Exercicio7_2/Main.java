package Exercicio7_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Please enter your name: ");
        student.studentName = scan.nextLine();

        System.out.print("Please enter grade number 1: ");
        student.gradeOne = scan.nextDouble();

        System.out.print("Please enter grade number 2: ");
        student.gradeTwo = scan.nextDouble();

        System.out.print("Please enter grade number 3: ");
        student.gradeThree = scan.nextDouble();

        student.finalResult();

    }

}
