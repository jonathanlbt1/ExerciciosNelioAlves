package Exercicios4;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTRADA: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int lasted;

        if(number1 != number2) {
            if (number1 > number2) {
                lasted = Math.abs(number1 - 24) + Math.abs(number2);
            } else {
                lasted = number2 - number1;
            }

        } else {
            lasted = 24;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)", lasted);
        sc.close();
    }
}
