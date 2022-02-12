package Exercicios4;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salario: ");
        double salario = sc.nextDouble();
        double imposto = 0;
        double calculo = 0;

        if(salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000) * 1.08;
            System.out.printf("R$ %.2f", imposto);
        } else if (salario <= 4500.00) {
            imposto = ((salario - 3000.00) * 0.18) + 80.00;
            System.out.printf("R$ %.2f",  imposto);
        } else if (salario > 4500) {
            imposto = ((salario - 4500.00) * 0.28) + 80.00 + 270;
            System.out.printf("R$ %.2f", imposto);
        }
        sc.close();
    }
}
