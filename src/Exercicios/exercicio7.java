package Exercicios;

public class exercicio7 {

	public static void main(String[] args) {
		 // Números do primeiro conjunto
        int num1 = 8;
        int num2 = 9;
        int num3 = 7;
        
        // Números do segundo conjunto
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        
        // Calculando a média dos três primeiros números
        double media1 = (num1 + num2 + num3) / 3.0;
        // Calculando a média dos três segundos números
        double media2 = (num4 + num5 + num6) / 3.0;
        
        // Soma das duas médias
        double somaMedias = media1 + media2;
        
        // Média das médias
        double mediaDasMedias = somaMedias / 2.0;
        
        // Imprimindo os resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}