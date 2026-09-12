import java.util.Scanner;

public class Desafio15n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorOriginal = sc.nextDouble();

        int percentualDesconto;

        if (valorOriginal <= 100){
            percentualDesconto = 0;
        } else if (valorOriginal <= 500){
            percentualDesconto = 10;
        } else {
            percentualDesconto = 20;
        }
        
        double valorDesconto = valorOriginal * percentualDesconto / 100;
        double valorFinal = valorOriginal - valorDesconto;

        System.out.println("--RESUMO DA COMPRA --");
        System.out.printf("Valor original: R$%.2f%n", valorOriginal);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.printf("Valor do desconto: R$%.2f%n", valorDesconto);
        System.out.printf("Valor final a pagar: R$%.2f%n", valorFinal);

        sc.close();
    
    }
}
