package Exercicios;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor total da compra: R$ ");
	        double valorCompra = scanner.nextDouble();

	        double valorPrestacao = valorCompra / 5;
	        System.out.println("O valor de cada uma das 5 prestações é: R$ " + String.format("%.2f", valorPrestacao));

	        scanner.close();
	    }
	}