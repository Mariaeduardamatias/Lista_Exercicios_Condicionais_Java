package Exercicios;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int soma = 0;

	        while (true) {
	            System.out.print("Digite um n�mero (negativo para encerrar): ");
	            int numero = scanner.nextInt();
	            if (numero < 0) {
	                break;
	            }
	            soma += numero;
	        }

	        System.out.println("A soma dos n�meros digitados �: " + soma);
	        scanner.close();
	    }

}
