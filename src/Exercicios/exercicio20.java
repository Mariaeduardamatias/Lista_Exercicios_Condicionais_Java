package Exercicios;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        int countMaiores = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Digite o n�mero " + i + ": ");
	            int numero = scanner.nextInt();
	            if (numero > 8) {
	                countMaiores++;
	            }
	        }

	        System.out.println("A quantidade de n�meros maiores que 8 �: " + countMaiores);
	        scanner.close();
	    }
	}
