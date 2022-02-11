package Exercicios4;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTRADA: ");
        int myNumber = sc.nextInt();

        if(myNumber > 0) {
            System.out.println("POSITIVO");
        } else if(myNumber < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NUMERO NEUTRO");
        }

        sc.close();
    }
}
