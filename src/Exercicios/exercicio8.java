package Exercicios;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura da porcentagem do IPI
	        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
	        double ipi = scanner.nextDouble();

	        // Leitura dos dados da pe�a 1
	        System.out.print("Digite o c�digo da pe�a 1: ");
	        String codigo1 = scanner.next();
	        System.out.print("Digite o valor unit�rio da pe�a 1: ");
	        double valor1 = scanner.nextDouble();
	        System.out.print("Digite a quantidade de pe�as 1: ");
	        int quantidade1 = scanner.nextInt();

	        // Leitura dos dados da pe�a 2
	        System.out.print("Digite o c�digo da pe�a 2: ");
	        String codigo2 = scanner.next();
	        System.out.print("Digite o valor unit�rio da pe�a 2: ");
	        double valor2 = scanner.nextDouble();
	        System.out.print("Digite a quantidade de pe�as 2: ");
	        int quantidade2 = scanner.nextInt();

	        // C�lculo do valor total a ser pago com IPI
	        double total = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

	        // Impress�o dos resultados
	        System.out.println("C�digo da pe�a 1: " + codigo1);
	        System.out.println("C�digo da pe�a 2: " + codigo2);
	        System.out.println("Valor total a ser pago: R$ " + String.format("%.2f", total));

	        scanner.close();
	    }
	}