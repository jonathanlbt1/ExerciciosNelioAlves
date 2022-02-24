package ExercicioVetor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name, email;
        int room;
        Hospedes[] hospedes = new Hospedes[10];

        System.out.print("How many rooms will be rented? ");
        int totalRooms = scan.nextInt();
        System.out.println();

        for(int i=0; i<totalRooms; i++ ) {
            System.out.println(String.format("Rent #%d", i+1) + ":");
            scan.nextLine();

            System.out.print("Name: ");
            name = scan.nextLine();

            System.out.print("Email: ");
            email = scan.nextLine();

            System.out.print("Room: ");
            room = scan.nextInt();
            System.out.println();

            hospedes[room] = new Hospedes(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for(int i=0; i <= hospedes.length-1; i++) {
            if(hospedes[i] != null) {
                System.out.println(hospedes[i]);
            }
        }
        scan.close();
    }
}
