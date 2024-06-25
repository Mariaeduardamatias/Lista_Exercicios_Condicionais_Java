package Exercicios;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Definindo o valor do sal�rio m�nimo
        final double SALARIO_MINIMO = 1212.00;

        // Lendo o valor do sal�rio do usu�rio
        System.out.print("Digite o valor do sal�rio m�nimo atual: R$ ");
        double salarioMinimoAtual = scanner.nextDouble();
        
        System.out.print("Digite o valor do seu sal�rio: R$ ");
        double salarioUsuario = scanner.nextDouble();

        // Calculando a quantidade de sal�rios m�nimos que o usu�rio ganha
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimoAtual;

        // Imprimindo o resultado
        System.out.printf("Voc� ganha %.2f sal�rios m�nimos.\n", quantidadeSalariosMinimos);

        scanner.close();
    }
}