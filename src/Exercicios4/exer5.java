package Exercicios4;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        int counter = 0;

        System.out.println("\n***BEM VINDO A LANCHONETE DO TIO JON***\n" +
                "\nMENU PARA HOJE:\n");
        System.out.println("CODIGO      ESPECIFICACAO       PRECO  \n" +
                "  1         Cachorro Quente     R$ 4,00\n" +
                "  2         X-Salada            R$ 4,50\n" +
                "  3         X-Bacon             R$ 5,00\n" +
                "  4         Torrada Simples     R$ 2,00\n" +
                "  5         Refrigerante        R$ 1,50\n");

        double total = 0.0;

        System.out.println("Escolha suas duas opcoes: ");
        while (counter != 2){
            escolha = sc.nextInt();
            if(escolha == 1) {
                total += 4.00;
            } else if (escolha == 2) {
                total += 4.50;
            } else if (escolha == 3) {
                total += 5.00;
            } else if (escolha == 4) {
                total += 2.00;
            } else if (escolha == 5) {
                total += 1.50;
            } else {
                System.out.println("Opcao inexistente! Encerrando atendimento...");
                break;
            }
            counter ++;
        }
        System.out.printf("Total: R$%.2f", total);
        sc.close();
    }
}
