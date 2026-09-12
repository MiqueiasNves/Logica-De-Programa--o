import java.util.Scanner;

public class Desafio12n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 1344;
        // posso deixar com uma estrutura de repetição para que o usuário tenha várias tentativas de acertar a senha, ou posso deixar apenas uma tentativa, caso ele erre, o programa é encerrado.
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
        
        //System.out.println("Digite a senha: ");
        //senha = sc.nextInt();
        //if (senha == 1344) {
        //    System.out.println("Acesso permitido!");
        //} else {
        //    System.out.println("Acesso negado!");
        //}
        
        sc.close();
    }
}
