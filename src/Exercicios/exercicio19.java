package Exercicios;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor da cota��o do d�lar: R$ ");
	        double cotacaoDolar = scanner.nextDouble();

	        System.out.print("Digite a quantidade de d�lares dispon�veis: US$ ");
	        double quantidadeDolares = scanner.nextDouble();

	        double valorEmReais = cotacaoDolar * quantidadeDolares;
	        System.out.println("O valor em reais �: R$ " + String.format("%.2f", valorEmReais));

	        scanner.close();
	    }
	}