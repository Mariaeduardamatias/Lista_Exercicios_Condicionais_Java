package Exercicios;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        int soma = 0;

	        System.out.println("Digite n�meros para somar. Digite um n�mero negativo para encerrar.");

	        while (true) {
	            System.out.print("Digite um n�mero: ");
	            int numero = scanner.nextInt();
	            
	            // Encerra a execu��o se o n�mero for negativo
	            if (numero < 0) {
	                break;
	            }
	            
	            // Adiciona o n�mero � soma
	            soma += numero;
	        }

	        System.out.println("A soma dos n�meros digitados �: " + soma);
	        scanner.close();
	    }
}
