package Exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o saldo m�dio do cliente no �ltimo ano: ");
	        double saldoMedio = scanner.nextDouble();

	        double creditoEspecial = 0;

	        if (saldoMedio <= 200) {
	            creditoEspecial = saldoMedio * 0.1;
	        } else if (saldoMedio > 200 && saldoMedio <= 300) {
	            creditoEspecial = saldoMedio * 0.2;
	        } else if (saldoMedio > 300 && saldoMedio <= 400) {
	            creditoEspecial = saldoMedio * 0.3;
	        } else if (saldoMedio > 400) {
	            creditoEspecial = saldoMedio * 0.4;
	        }

	        System.out.println("Saldo m�dio: R$ " + saldoMedio);
	        System.out.println("Valor do cr�dito especial: R$ " + creditoEspecial);

	        scanner.close();
	    }
	
	}


