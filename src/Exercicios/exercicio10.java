package Exercicios;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do saldo atual
        System.out.print("Digite o saldo atual: R$ ");
        double saldoAtual = scanner.nextDouble();

        // Cálculo do reajuste de 1.5%
        double reajuste = saldoAtual * 0.015;
        double saldoReajustado = saldoAtual + reajuste;

        // Impressão do saldo reajustado
        System.out.printf("Saldo atual: R$ %.2f\n", saldoAtual);
        System.out.printf("Saldo com reajuste de 1.5%%: R$ %.2f\n", saldoReajustado);

        scanner.close();
    }
}

	