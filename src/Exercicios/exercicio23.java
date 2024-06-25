package Exercicios;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int countZeroACem = 0;
        int countCemADuzentos = 0;
        int countMaiorDuzentos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                countZeroACem++;
            } else if (numero >= 101 && numero <= 200) {
                countCemADuzentos++;
            } else if (numero > 200) {
                countMaiorDuzentos++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + countZeroACem);
        System.out.println("Quantidade de números entre 101 e 200: " + countCemADuzentos);
        System.out.println("Quantidade de números maiores que 200: " + countMaiorDuzentos);
        scanner.close();
    }
}
