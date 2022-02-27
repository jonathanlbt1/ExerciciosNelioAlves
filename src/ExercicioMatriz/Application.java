package ExercicioMatriz;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas: ");
        int M = scan.nextInt();
        System.out.print("Informe a quantidade de colunas: ");
        int N = scan.nextInt();

        int[][] matriz = new int[M][N];

        System.out.println("Insira os valores para sua matriz: ");
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.print("\nValor para busca? ");
        int numeroParaBusca = scan.nextInt();

        valoresAoRedor(numeroParaBusca, matriz);
        scan.close();
    }

    public static void valoresAoRedor(int x, int[][] y) {
        for(int i=0; i<y.length; i++) {
            for(int j=0; j<y[i].length; j++) {
                if(y[i][j] == x) {
                    System.out.print(String.format("\nPosition %d, ", i) + j + ":");
                    if(j > 0) {
                        System.out.printf("\nLeft: %d", y[i][j-1]);
                    }
                    if(j < y[i].length-1) {
                        System.out.printf("\nRight: %d", y[i][j+1]);
                    }
                    if(i > 0) {
                        System.out.printf("\nUp: %d",y[i-1][j]);
                    }
                    if(i < y[i].length-1) {
                        System.out.printf("\nDown: %d", y[i+1][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
