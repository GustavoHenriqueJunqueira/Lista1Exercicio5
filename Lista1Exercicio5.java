package lista1exercicio5;

import java.util.Scanner;

public class Lista1Exercicio5 {

    public static void main(String[] args) {
        
        System.out.println("Programa para saber qual o valor de desconto que foi aplicado sobre um produto");
        
            float DESC, PRECO, PRECOF;
            
        System.out.println("Digite o valor do produto original ");
        Scanner teclado = new Scanner (System.in);
        PRECO = teclado.nextFloat();
        System.out.println("Digite o valor final a ser pago pelo produto (Já com desconto)");
        PRECOF = teclado.nextFloat();
        
        DESC = PRECO - PRECOF;
        
        DESC = (float) (DESC*0.01);
        
        System.out.println("O A porcentagem de desconto é de: ");
        System.out.println(DESC);
        
    }
    
}
