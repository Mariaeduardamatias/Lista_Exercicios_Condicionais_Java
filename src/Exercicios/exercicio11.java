package Exercicios;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do nome do vendedor
	        System.out.print("Digite o nome do vendedor: ");
	        String nome = scanner.nextLine();

	        // Leitura do salário fixo
	        System.out.print("Digite o salário fixo do vendedor: R$ ");
	        double salarioFixo = scanner.nextDouble();

	        // Leitura do total de vendas efetuadas no mês
	        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mês: R$ ");
	        double totalVendas = scanner.nextDouble();

	        // Cálculo da comissão (15% sobre o total de vendas)
	        double comissao = totalVendas * 0.15;

	        // Cálculo do salário final
	        double salarioFinal = salarioFixo + comissao;

	        // Impressão dos resultados
	        System.out.println("Nome do vendedor: " + nome);
	        System.out.println("Salário fixo: R$ " + String.format("%.2f", salarioFixo));
	        System.out.println("Salário final com comissão: R$ " + String.format("%.2f", salarioFinal));

	        scanner.close();
	    }
	}