package Exercicios;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int countEntreZeroECem = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Digite o n�mero " + i + ": ");
	            int numero = scanner.nextInt();
	            if (numero >= 0 && numero <= 100) {
	                countEntreZeroECem++;
	            }
	        }

	        System.out.println("A quantidade de n�meros entre 0 e 100 �: " + countEntreZeroECem);
	        scanner.close();
	    }
}
