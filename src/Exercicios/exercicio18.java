package Exercicios;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        String nomeMaisNova = "";
	        int idadeMaisNova = Integer.MAX_VALUE;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o nome da pessoa " + i + ": ");
	            String nome = scanner.next();
	            System.out.print("Digite a idade da pessoa " + i + ": ");
	            int idade = scanner.nextInt();

	            if (idade < idadeMaisNova) {
	                idadeMaisNova = idade;
	                nomeMaisNova = nome;
	            }
	        }

	        System.out.println("A pessoa mais nova é " + nomeMaisNova + " com " + idadeMaisNova + " anos.");
	        scanner.close();
	    }
	}