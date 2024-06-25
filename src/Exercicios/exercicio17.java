package Exercicios;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int countMaiores = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Digite a idade da pessoa " + i + ": ");
	            int idade = scanner.nextInt();
	            if (idade >= 18) {
	                countMaiores++;
	            }
	        }

	        System.out.println("O número de pessoas maiores de idade é: " + countMaiores);
	        scanner.close();
	    }
	}