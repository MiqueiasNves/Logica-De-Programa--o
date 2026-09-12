import java.util.Scanner;

public class Desafio10n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 35;
        int palpite = 0;
        

        while (palpite != numeroSecreto) {
            System.out.println("Digite seu palpite: ");
            palpite = sc.nextInt();
        
            if (palpite > numeroSecreto) {
            System.out.println("O número secreto é menor!");
            } else if (palpite < numeroSecreto) {
            System.out.println("O número secreto é maior!");
            } else {
            System.out.println("Parabéns! Você acertou!");
            } 
        }
        sc.close();
    }
}
