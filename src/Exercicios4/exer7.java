package Exercicios4;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero para o eixo x: ");
        double x = sc.nextDouble();
        System.out.println("Digite o numero para o eixo y: ");
        double y = sc.nextDouble();

        if(x == 0 || y == 0) {
            System.out.println("Ponto de origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        sc.close();
    }
}
