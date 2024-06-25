package Exercicios;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int soma = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número " + i + ": ");
	            int numero = scanner.nextInt();
	            soma += numero;
	        }

	        System.out.println("A soma dos 10 números é: " + soma);
	        scanner.close();
	    }
	}

