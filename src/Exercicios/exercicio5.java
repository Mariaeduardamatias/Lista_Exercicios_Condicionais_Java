package Exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade da pessoa: ");
	        int idade = scanner.nextInt();

	        if (idade < 16) {
	            System.out.println("N�o eleitor.");
	        } else if (idade >= 18 && idade < 65) {
	            System.out.println("Eleitor obrigat�rio.");
	        } else {
	            System.out.println("Eleitor facultativo.");
	        }

	        scanner.close();
	    }
	}

