package Exercicios;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do nome do vendedor
	        System.out.print("Digite o nome do vendedor: ");
	        String nome = scanner.nextLine();

	        // Leitura do sal�rio fixo
	        System.out.print("Digite o sal�rio fixo do vendedor: R$ ");
	        double salarioFixo = scanner.nextDouble();

	        // Leitura do total de vendas efetuadas no m�s
	        System.out.print("Digite o total de vendas efetuadas pelo vendedor no m�s: R$ ");
	        double totalVendas = scanner.nextDouble();

	        // C�lculo da comiss�o (15% sobre o total de vendas)
	        double comissao = totalVendas * 0.15;

	        // C�lculo do sal�rio final
	        double salarioFinal = salarioFixo + comissao;

	        // Impress�o dos resultados
	        System.out.println("Nome do vendedor: " + nome);
	        System.out.println("Sal�rio fixo: R$ " + String.format("%.2f", salarioFixo));
	        System.out.println("Sal�rio final com comiss�o: R$ " + String.format("%.2f", salarioFinal));

	        scanner.close();
	    }
	}