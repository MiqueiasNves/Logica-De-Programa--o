import java.util.Scanner;

public class Desafio18int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int menor = 0;


        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número: ");
            int numero = sc.nextInt(); 

            if (i == 1){
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior){
                    maior = numero;
                }
                if (numero < menor){
                    menor = numero;
                }
            }
        }


        System.out.println("Maior Número: " + maior);
        System.out.println("Menor Número: " + menor);


        sc.close();
    
    }
}
