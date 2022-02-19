package Exercicios7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rec.Width = sc.nextDouble();
        rec.Height = sc.nextDouble();

        System.out.printf("\nAREA = %.2f", rec.area());
        System.out.printf("\nPERIMETER = %.2f", rec.Perimeter());
        System.out.printf("\nDIAGONAL = %.2f", rec.Diagonal());

        sc.close();
    }
}
