package Exercicios;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 10 == 0) {
            System.out.println(numero + " � divis�vel por 10.");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " � divis�vel por 5, mas n�o por 10.");
        } else if (numero % 2 == 0) {
            System.out.println(numero + " � divis�vel por 2, mas n�o por 5 nem por 10.");
        } else {
            System.out.println(numero + " n�o � divis�vel por 2, 5 ou 10.");
        }

        scanner.close();
    }
}