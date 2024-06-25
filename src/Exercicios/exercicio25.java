package Exercicios;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        int soma = 0;

	        System.out.println("Digite números para somar. Digite um número negativo para encerrar.");

	        while (true) {
	            System.out.print("Digite um número: ");
	            int numero = scanner.nextInt();
	            
	            // Encerra a execução se o número for negativo
	            if (numero < 0) {
	                break;
	            }
	            
	            // Adiciona o número à soma
	            soma += numero;
	        }

	        System.out.println("A soma dos números digitados é: " + soma);
	        scanner.close();
	    }
}
