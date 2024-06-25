package Exercicios;
import java.util.Scanner;

public class calorias {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int caloriasPrato = 0;
	        int caloriasSobremesa = 0;
	        int caloriasBebida = 0;

	        System.out.println("Escolha um prato: 1 - Vegetariano, 2 - Peixe, 3 - Frango, 4 - Carne");
	        int pratoEscolhido = scanner.nextInt();

	        switch (pratoEscolhido) {
	            case 1:
	                caloriasPrato = 180;
	                break;
	            case 2:
	                caloriasPrato = 230;
	                break;
	            case 3:
	                caloriasPrato = 250;
	                break;
	            case 4:
	                caloriasPrato = 350;
	                break;
	            default:
	                System.out.println("Escolha de prato inválida.");
	                return;
	        }

	        System.out.println("Escolha uma sobremesa: 1 - Abacaxi, 2 - Sorvete diet, 3 - Mousse diet, 4 - Mousse chocolate");
	        int sobremesaEscolhida = scanner.nextInt();

	        switch (sobremesaEscolhida) {
	            case 1:
	                caloriasSobremesa = 75;
	                break;
	            case 2:
	                caloriasSobremesa = 110;
	                break;
	            case 3:
	                caloriasSobremesa = 170;
	                break;
	            case 4:
	                caloriasSobremesa = 200;
	                break;
	            default:
	                System.out.println("Escolha de sobremesa inválida.");
	                return;
	        }

	        System.out.println("Escolha uma bebida: 1 - Chá, 2 - Suco de laranja, 3 - Suco de melão, 4 - Refrigerante diet");
	        int bebidaEscolhida = scanner.nextInt();

	        switch (bebidaEscolhida) {
	            case 1:
	                caloriasBebida = 20;
	                break;
	            case 2:
	                caloriasBebida = 70;
	                break;
	            case 3:
	                caloriasBebida = 100;
	                break;
	            case 4:
	                caloriasBebida = 65;
	                break;
	            default:
	                System.out.println("Escolha de bebida inválida.");
	                return;
	        }

	        int totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

	        System.out.println("Total de calorias da refeição: " + totalCalorias);

	        scanner.close();
	}

}
