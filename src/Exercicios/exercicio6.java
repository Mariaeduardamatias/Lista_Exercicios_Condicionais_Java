package Exercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um n�mero inteiro: ");
	        int numero = scanner.nextInt();

	        int antecessor = numero - 1;
	        int sucessor = numero + 1;

	        System.out.println("Antecessor de " + numero + " �: " + antecessor);
	        System.out.println("Sucessor de " + numero + " �: " + sucessor);

	        scanner.close();
	    }
	}

