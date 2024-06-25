package Exercicios;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Definindo o valor do salário mínimo
        final double SALARIO_MINIMO = 1212.00;

        // Lendo o valor do salário do usuário
        System.out.print("Digite o valor do salário mínimo atual: R$ ");
        double salarioMinimoAtual = scanner.nextDouble();
        
        System.out.print("Digite o valor do seu salário: R$ ");
        double salarioUsuario = scanner.nextDouble();

        // Calculando a quantidade de salários mínimos que o usuário ganha
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimoAtual;

        // Imprimindo o resultado
        System.out.printf("Você ganha %.2f salários mínimos.\n", quantidadeSalariosMinimos);

        scanner.close();
    }
}