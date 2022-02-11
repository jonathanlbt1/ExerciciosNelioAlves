package Exercicios4;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTRADA: ");
        int myNumber1 = sc.nextInt();
        int myNumber2 = sc.nextInt();

        if(myNumber1 % myNumber2 == 0 || myNumber2 % myNumber1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();

    }
}
