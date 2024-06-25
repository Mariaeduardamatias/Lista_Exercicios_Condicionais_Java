package Exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int primeiro = scanner.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int segundo = scanner.nextInt();
        
        System.out.println("Digite o terceiro valor:");
        int terceiro = scanner.nextInt();

        int troca;

        if (primeiro < segundo) {
            troca = primeiro;
            primeiro = segundo;
            segundo = troca;
        }

        if (primeiro < terceiro) {
            troca = primeiro;
            primeiro = terceiro;
            terceiro = troca;
        }

        if (segundo < terceiro) {
            troca = segundo;
            segundo = terceiro;
            terceiro = troca;
        }
        
        System.out.println("Valores em ordem decrescente: " + primeiro + ", " + segundo + ", " + terceiro);
    }


	}


