package Exercicios;

public class exercicio7 {

	public static void main(String[] args) {
		 // N�meros do primeiro conjunto
        int num1 = 8;
        int num2 = 9;
        int num3 = 7;
        
        // N�meros do segundo conjunto
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        
        // Calculando a m�dia dos tr�s primeiros n�meros
        double media1 = (num1 + num2 + num3) / 3.0;
        // Calculando a m�dia dos tr�s segundos n�meros
        double media2 = (num4 + num5 + num6) / 3.0;
        
        // Soma das duas m�dias
        double somaMedias = media1 + media2;
        
        // M�dia das m�dias
        double mediaDasMedias = somaMedias / 2.0;
        
        // Imprimindo os resultados
        System.out.println("M�dia dos n�meros 8, 9 e 7: " + media1);
        System.out.println("M�dia dos n�meros 4, 5 e 6: " + media2);
        System.out.println("Soma das duas m�dias: " + somaMedias);
        System.out.println("M�dia das m�dias: " + mediaDasMedias);
    }
}