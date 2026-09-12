import java.util.Scanner;

public class Desafio20int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int senha = 1344;
        
        while (true) {
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
            if (senha == 1344) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                System.out.println("Acesso negado! Tente novamente.");
            }
        }

        sc.close();

    }
}
