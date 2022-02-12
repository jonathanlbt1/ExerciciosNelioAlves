package Exercicios4;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero entre 0 e 100: ");
        double myNumber = sc.nextDouble();

        if(myNumber > 100 || myNumber < 0) {
            System.out.println("Fora de Intervalo...");
        } else if (myNumber <= 25) {
            System.out.println("Intervalo 0, 25");
        } else if (myNumber <= 50) {
            System.out.println("Intervalo 25, 50");
        } else if (myNumber <= 75) {
            System.out.println("Intervalo 50, 75");
        } else if (myNumber <= 100) {
            System.out.println("Intervalo 75, 100");
        }
        sc.close();
    }
}
