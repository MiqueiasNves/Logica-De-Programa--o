import java.util.Scanner;

public class Desafio16int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int contadorPar = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i +"º número: ");
            int numero = sc.nextInt();
            if (numero % 2 == 0){
                contadorPar++;
            }
        }
        System.out.println("Quantidade de números pares digitados: " + contadorPar);
        
        sc.close();
    }
}
